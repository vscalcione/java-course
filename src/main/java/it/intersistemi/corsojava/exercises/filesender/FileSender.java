package it.intersistemi.corsojava.exercises.filesender;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class FileSender {

    private Frame frame, clientGui, serverGui;
    private Button clientButton, serverButton, connectButton, fileSelectButton, sendFileButton;
    private Label ipAddress;
    private Panel clientPanel, serverPanel;
    private FileDialog fileDialog;
    private TextField ipTextField, selectedFileName;
    private File file;

    public FileSender(){
        frame = new Frame("FileSender");
        clientButton = new Button("CLIENT");
        serverButton = new Button("SERVER");
    }

    public void setupGUI(){
        clientButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                createClientGui();
                frame.setVisible(false);
            }
        });

        serverButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                createServerGui();
                frame.setVisible(false);
            }
        });

        frame.add(clientButton, BorderLayout.EAST);
        frame.add(serverButton, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);
    }

    public void createClientGui(){
        clientGui = new Frame("CLIENT");
        clientPanel = new Panel();

        ipAddress = new Label("ENTER SERVER IP");
        clientPanel.add(ipAddress);

        ipTextField = new TextField();
        ipTextField.setPreferredSize(new Dimension(200,20));
        clientPanel.add(ipTextField);

        clientGui.add(clientPanel,BorderLayout.NORTH);

        connectButton = new Button("Connect to the server");
        connectButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Client c = new Client(ipTextField.getText());
                }catch(Exception ev){
                    ev.printStackTrace();
                }
            }
        });
        clientPanel = new Panel();

        clientPanel.add(connectButton);
        clientGui.add(clientPanel,BorderLayout.SOUTH);

        clientGui.pack();
        clientGui.setVisible(true);
    }

    public void createServerGui(){
        serverGui = new Frame("SERVER");
        serverPanel = new Panel();

        selectedFileName = new TextField();
        selectedFileName.setPreferredSize(new Dimension(200,20));
        serverPanel.add(selectedFileName);

        fileSelectButton = new Button("Select File");
        fileSelectButton.addActionListener(new ActionListener(){
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e){
                fileDialog = new FileDialog(serverGui);
                fileDialog.show();
                file = new File(fileDialog.getDirectory() + fileDialog.getFile());
                selectedFileName.setText(file.getAbsolutePath());
                System.out.println(fileDialog.getFile());
            }
        });
        serverPanel.add(fileSelectButton);
        serverGui.add(serverPanel, BorderLayout.NORTH);
        serverPanel = new Panel();
        sendFileButton = new Button("Send!");
        sendFileButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Server s = new Server(file);
                }catch(IOException ex){ex.printStackTrace();}
            }
        });
        serverPanel.add(sendFileButton);

        serverGui.add(serverPanel, BorderLayout.SOUTH);

        serverGui.pack();
        serverGui.setVisible(true);
    }

    public static void main(String args[]){
        new FileSender().setupGUI();
    }
}

