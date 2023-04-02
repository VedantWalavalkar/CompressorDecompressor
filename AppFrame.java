package AccioProjects.CompressorDecompressor;

import AccioProjects.CompressorDecompressor.comp_decomp.compressor;
import AccioProjects.CompressorDecompressor.comp_decomp.decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {

    JButton compressButton;
    JButton decompreeButton;

    public AppFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        compressButton = new JButton("Select File to compress");
        compressButton.setBounds(20,100,200,30);
        compressButton.addActionListener(this);

        decompreeButton = new JButton("Select File to decompress");
        decompreeButton.setBounds(250,100,200,30);
        decompreeButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompreeButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
//        compressButton.addActionListener(this);
//        decompreeButton.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == fileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }

        if(e.getSource() == decompreeButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == fileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    decompressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
}
