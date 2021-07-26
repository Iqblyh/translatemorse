
package translatejawamorse;

import java.awt.Dimension;
import java.awt.Toolkit;

public class MainFrame extends javax.swing.JFrame {
    String jawa, morse, a, b;
    public static String morseToJawa(String[] code, String morseCode, char[] letter)
    {
        StringBuilder sb1 = new StringBuilder();
        String[] array = morseCode.split(" ");
        String x;
        // Morse code to Jawa
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    sb1.append(letter[j]);
                }
            }
        }
        x = sb1.toString();
        return x;
    }
    public static String jawaToMorse(String[] code, String jawa,char[] letter)
    {
        StringBuilder sb2 = new StringBuilder();
        String x;
        for (int i = 0; i < jawa.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (jawa.charAt(i) == letter[j]) {
                    sb2.append(code[j] + " ");
                    break;
                }
            }
        }
        x = sb2.toString();
        return x;
    }
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setSize(960, 540);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width / 2, dim.height/2 - this.getSize().height/2);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        bahasa2 = new javax.swing.JComboBox<>();
        bahasa1 = new javax.swing.JComboBox<>();
        outputTextArea = new javax.swing.JTextArea();
        inputTextArea = new javax.swing.JTextArea();
        kelompok = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("TRANSLATE JAWA TO MORSE");
        judul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        judul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 1090, 80));

        bahasa2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bahasa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MORSE", "JAWA" }));
        bahasa2.setBorder(null);
        bahasa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bahasa2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        bahasa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahasa2ActionPerformed(evt);
            }
        });
        getContentPane().add(bahasa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 450, 48));

        bahasa1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bahasa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAWA", "MORSE" }));
        bahasa1.setBorder(null);
        bahasa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bahasa1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        bahasa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahasa1ActionPerformed(evt);
            }
        });
        getContentPane().add(bahasa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 460, 48));

        outputTextArea.setEditable(false);
        outputTextArea.setColumns(30);
        outputTextArea.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        outputTextArea.setLineWrap(true);
        outputTextArea.setRows(5);
        outputTextArea.setWrapStyleWord(true);
        outputTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        getContentPane().add(outputTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 450, 270));

        inputTextArea.setColumns(30);
        inputTextArea.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        inputTextArea.setLineWrap(true);
        inputTextArea.setRows(5);
        inputTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        inputTextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputTextAreaCaretUpdate(evt);
            }
        });
        getContentPane().add(inputTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 270));

        kelompok.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        kelompok.setForeground(new java.awt.Color(255, 255, 255));
        kelompok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kelompok.setText("- Pecinta Kucing Indonesia -");
        getContentPane().add(kelompok, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 550, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/translatejawamorse/Images/bgbg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bahasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahasa1ActionPerformed
        String pilihan = (String) bahasa1.getSelectedItem();
        if(pilihan == "JAWA"){
            bahasa2.setSelectedItem("MORSE");
        } else {
            bahasa2.setSelectedItem("JAWA");
        }
    }//GEN-LAST:event_bahasa1ActionPerformed

    private void bahasa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahasa2ActionPerformed
        String pilihan = (String) bahasa2.getSelectedItem();
        String x,y;
        if(pilihan == "JAWA"){
            bahasa1.setSelectedItem("MORSE");
            inputTextArea.setText(a);
            outputTextArea.setText(jawa);
        } else {
            bahasa1.setSelectedItem("JAWA");
            inputTextArea.setText(b);
            outputTextArea.setText(morse);
        }
    }//GEN-LAST:event_bahasa2ActionPerformed

    private void inputTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputTextAreaCaretUpdate
         // masukan alphbet ke array letter
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0', ' '};
        // Morse code by indexing
        String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
                          "..-.", "--.",  "....", "..",   ".---",
                          "-.-",  ".-..", "--",   "-.",   "---",
                          ".--.", "--.-", ".-.",  "...",  "-",
                          "..-",  "...-", ".--",  "-..-", "-.--",
                          "--..", ".----", "..---", "...--", "....-",
                          ".....", "-....", "--...", "---..", "----.", "-----", "/" };
        
        String pilihan = (String) bahasa1.getSelectedItem();
        String x,y;
        if(pilihan == "JAWA"){
            x = inputTextArea.getText().toLowerCase();
            jawa = inputTextArea.getText();
            y = jawaToMorse(code, x, letter);
            a = y;
            outputTextArea.setText(y);
        } else {
            x = inputTextArea.getText().toLowerCase();
            morse = inputTextArea.getText();
            y = morseToJawa(code, x, letter);
            b = y;
            outputTextArea.setText(y);
        }
    }//GEN-LAST:event_inputTextAreaCaretUpdate
    
    
   
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bahasa1;
    private javax.swing.JComboBox<String> bahasa2;
    private javax.swing.JLabel bg;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kelompok;
    private javax.swing.JTextArea outputTextArea;
    // End of variables declaration//GEN-END:variables
}
