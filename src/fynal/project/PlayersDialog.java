package fynal.project;

import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dylan
 */
public class PlayersDialog extends javax.swing.JDialog {
    String vehicle1 =null;
    String vehicle2=null;
    String vehicle3=null;
    String vehicle4=null;
    String vehicle5=null;
    String vehicle6=null;
    Vehicles one,two,three,four,five,six;
    String First,Second;
    int ataqueT = 10;
    int defensaT = 6;
    int punteriaT = 60;
    int HP = 50;
    int PP = 5;
    int nivel = 1;
    int experiencia = 0;
        
    String barra = File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"Registros"+barra;
    File contenedor = new File(ubicacion);
    File[] registros = contenedor.listFiles();
    
    DefaultTableModel dtm;

    /**
     * Creates new form PlayersDialog
     */
    public PlayersDialog() {
        this.setLocationRelativeTo(null);
        initComponents();
        BTG1.clearSelection();
        BTG2.clearSelection();
        BTG3.clearSelection();
        BTG4.clearSelection();
        BTG5.clearSelection();
        BTG6.clearSelection();   
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTG1 = new javax.swing.ButtonGroup();
        BTG2 = new javax.swing.ButtonGroup();
        BTG3 = new javax.swing.ButtonGroup();
        BTG4 = new javax.swing.ButtonGroup();
        BTG5 = new javax.swing.ButtonGroup();
        BTG6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelP1 = new javax.swing.JLabel();
        TextFieldP1 = new javax.swing.JTextField();
        LabelP2 = new javax.swing.JLabel();
        TextFieldP2 = new javax.swing.JTextField();
        ButtonPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RBP1 = new javax.swing.JRadioButton();
        RBT1 = new javax.swing.JRadioButton();
        RBP2 = new javax.swing.JRadioButton();
        RBT2 = new javax.swing.JRadioButton();
        RBP3 = new javax.swing.JRadioButton();
        RBT3 = new javax.swing.JRadioButton();
        RBP4 = new javax.swing.JRadioButton();
        RBT4 = new javax.swing.JRadioButton();
        RBP5 = new javax.swing.JRadioButton();
        RBT5 = new javax.swing.JRadioButton();
        RBP6 = new javax.swing.JRadioButton();
        RBT6 = new javax.swing.JRadioButton();
        jTextNick1 = new javax.swing.JTextField();
        jTextNick2 = new javax.swing.JTextField();
        jTextNick3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        LabelP1.setText("Player 1");

        LabelP2.setText("Player 2");

        ButtonPlay.setText("PLAY");
        ButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlayActionPerformed(evt);
            }
        });

        jLabel1.setText("After typing your name choose a vehicle and assign a name each a one");

        BTG1.add(RBP1);
        RBP1.setText("War Plane");

        BTG1.add(RBT1);
        RBT1.setText("War Tank");

        BTG2.add(RBP2);
        RBP2.setText("War Plane");

        BTG2.add(RBT2);
        RBT2.setText("War Tank");

        BTG3.add(RBP3);
        RBP3.setText("War Plane");

        BTG3.add(RBT3);
        RBT3.setText("War Tank");

        BTG4.add(RBP4);
        RBP4.setText("War Plane");

        BTG4.add(RBT4);
        RBT4.setText("War Tank");

        BTG5.add(RBP5);
        RBP5.setText("War Plane");

        BTG5.add(RBT5);
        RBT5.setText("War Tank");

        BTG6.add(RBP6);
        RBP6.setText("War Plane");
        RBP6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBP6ActionPerformed(evt);
            }
        });

        BTG6.add(RBT6);
        RBT6.setText("War Tank");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(279, 279, 279)
                                .addComponent(LabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(TextFieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RBP5)
                                            .addComponent(RBP6))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RBT6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RBT5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBP4)
                                        .addGap(39, 39, 39)
                                        .addComponent(RBT4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBP1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBT1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBP2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBT2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBP3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBT3)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNick1)
                                    .addComponent(jTextNick2)
                                    .addComponent(jTextNick3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldP1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldP2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RBP1)
                                    .addComponent(RBT1)
                                    .addComponent(jTextNick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RBT2)
                                    .addComponent(RBP2)
                                    .addComponent(jTextNick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RBT3)
                                    .addComponent(RBP3)
                                    .addComponent(jTextNick3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBP4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RBT4)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RBP5)
                                    .addComponent(RBT5)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RBP6)
                                    .addComponent(RBT6)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlayActionPerformed
        addVehicles();
        addPlayers();
        if(!TextFieldP2.getText().equals(""))
            addPlayers2();
    }//GEN-LAST:event_ButtonPlayActionPerformed

    /**
     * addVehicles
     *Este metodo es para qeu me agregue los vehiculos al combobox 
     */
    private void addVehicles(){

        if(RBP1.isSelected()){
         vehicle1 = "War Plane";
         one = new Plane(7,3,70,0,0); 
        }
        else if(RBT1.isSelected()){
         vehicle1 = "War Tank";
         one = new Tank(10,6,60,0,0);  
        }
        
        if(RBP2.isSelected()){
         vehicle2 = "War Plane";
         two = new Plane(7,3,70,0,0); 
        }
        else if(RBT2.isSelected()){
         vehicle2 = "War Tank";
         two = new Tank(10,6,60,0,0);  
        }
        
        if(RBP3.isSelected()){
         vehicle3 = "War Plane";
         three = new Plane(7,3,70,0,0); 
        }
        else if(RBT3.isSelected()){
         vehicle3 = "War Tank";
         three = new Tank(10,6,60,0,0);  
        }
        
        if(RBP4.isSelected()){
         vehicle1 = "War Plane";
         four = new Plane(7,3,70,0,0); 
        }
        else if(RBT4.isSelected()){
         vehicle4 = "War Tank";
         four = new Tank(10,6,60,0,0);  
        }
        
        if(RBP5.isSelected()){
         vehicle5 = "War Plane";
         five = new Plane(7,3,70,0,0); 
        }
        else if(RBT5.isSelected()){
         vehicle5 = "War Tank";
         five = new Tank(10,6,60,0,0);  
        }
        
        if(RBP6.isSelected()){
         vehicle6 = "War Plane";
         six = new Plane(7,3,70,0,0); 
        }
        else if(RBT6.isSelected()){
         vehicle6 = "War Tank";
         six = new Tank(10,6,60,0,0);  
        }
    }
    
    
    /**
     *Metodo que me crea archivos en una carpeta dentro del proyecto 
     */
    private void addPlayers(){
        String archivo = TextFieldP1.getText()+".dr";
        File creaUbicacion = new File(ubicacion);
        File creaArchivo = new File(ubicacion+archivo);
        if((TextFieldP1.getText().equals("")&&!TextFieldP2.isEnabled())||(TextFieldP1.getText().equals("")&&TextFieldP2.isEnabled()&&TextFieldP2.getText().equals(""))
            ||jTextNick1.getText().equals("")||jTextNick3.getText().equals("")||jTextNick2.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please fill in all the fields");
        else{
            try{
                if(creaArchivo.exists())
                    JOptionPane.showMessageDialog(rootPane, "The name already exist, please choose a different name");
                else{
                    creaUbicacion.mkdirs();
                    Formatter crea = new Formatter(ubicacion+archivo);
                    crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n"
                            + "%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", 
                            "Name="+TextFieldP1.getText(),"Vehicle1="+jTextNick1.getText(),
                            "Ataque="+one.getAttack(),
                            "Defensa="+one.getDefending(),
                            "Punteria="+one.getAim(),
                            "HP="+one.getHP(),
                            "PP="+one.getPP(),
                            "Nivel="+one.getLevel(),
                            "Experiencia="+one.getExperience(),
                            "destroyedEnemies="+one.getDestroyed(),
                            "destroyer="+one.getDestroyer(),
                            "Vehicle2="+jTextNick2.getText(),
                            "Ataque="+two.getAttack(),
                            "Defensa="+two.getDefending(),
                            "Punteria="+two.getAim(),
                            "HP="+two.getHP(),
                            "PP="+two.getPP(),
                            "Nivel="+two.getLevel(),
                            "Experiencia="+two.getExperience(),
                            "destroyedEnemies="+two.getDestroyed(),
                            "destroyer="+two.getDestroyer(),
                            "Vehicle3="+jTextNick3.getText(),
                            "Ataque="+three.getAttack(),
                            "Defensa="+three.getDefending(),
                            "Punteria="+three.getAim(),
                            "HP="+three.getHP(),
                            "PP="+three.getPP(),
                            "Nivel="+three.getLevel(),
                            "Experiencia="+three.getExperience(),
                            "destroyedEnemies="+three.getDestroyed(),
                            "destroyer="+three.getDestroyer(),
                            "TipoVehiculo1="+vehicle1,
                            "TipoVehiculo2="+vehicle2,
                            "TipoVehiculo3="+vehicle3);
                    crea.close();
                    JOptionPane.showMessageDialog(rootPane, "Congratulations, now press Add Vehicle");
                    registros = contenedor.listFiles();
                    setVisible(false);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "You must choose the vehicles");
            }
        }
    }
    
    private void addPlayers2(){
        String archivo = TextFieldP2.getText()+".dr";
        File creaUbicacion = new File(ubicacion);
        File creaArchivo = new File(ubicacion+archivo);
        if((TextFieldP1.getText().equals("")&&!TextFieldP2.isEnabled())||(TextFieldP1.getText().equals("")&&TextFieldP2.isEnabled()&&TextFieldP2.getText().equals(""))
            ||jTextNick1.getText().equals("")||jTextNick3.getText().equals("")||jTextNick2.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please fill in all the fields");
        else{
            try{
                if(creaArchivo.exists())
                    JOptionPane.showMessageDialog(rootPane, "The name already exist, please choose a different name");
                else{
                    creaUbicacion.mkdirs();
                    Formatter crea = new Formatter(ubicacion+archivo);
                    crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n"
                            + "%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", 
                            "Name="+TextFieldP1.getText(),"Vehicle1="+jTextNick1.getText(),
                            "Ataque="+one.getAttack(),
                            "Defensa="+one.getDefending(),
                            "Punteria="+one.getAim(),
                            "HP="+one.getHP(),
                            "PP="+one.getPP(),
                            "Nivel="+one.getLevel(),
                            "Experiencia="+one.getExperience(),
                            "destroyedEnemies="+one.getDestroyed(),
                            "destroyer="+one.getDestroyer(),
                            "Vehicle2="+jTextNick2.getText(),
                            "Ataque="+two.getAttack(),
                            "Defensa="+two.getDefending(),
                            "Punteria="+two.getAim(),
                            "HP="+two.getHP(),
                            "PP="+two.getPP(),
                            "Nivel="+two.getLevel(),
                            "Experiencia="+two.getExperience(),
                            "destroyedEnemies="+two.getDestroyed(),
                            "destroyer="+two.getDestroyer(),
                            "Vehicle3="+jTextNick3.getText(),
                            "Ataque="+three.getAttack(),
                            "Defensa="+three.getDefending(),
                            "Punteria="+three.getAim(),
                            "HP="+three.getHP(),
                            "PP="+three.getPP(),
                            "Nivel="+three.getLevel(),
                            "Experiencia="+three.getExperience(),
                            "destroyedEnemies="+three.getDestroyed(),
                            "destroyer="+three.getDestroyer(),
                            "TipoVehiculo1="+vehicle1,
                            "TipoVehiculo2="+vehicle2,
                            "TipoVehiculo3="+vehicle3);
                    crea.close();
                    JOptionPane.showMessageDialog(rootPane, "Congratulations, now press Add Vehicle");
                    registros = contenedor.listFiles();
                    setVisible(false);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "You must choose the vehicles");
            }
        }
    }
    private void RBP6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBP6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBP6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTG1;
    private javax.swing.ButtonGroup BTG2;
    private javax.swing.ButtonGroup BTG3;
    private javax.swing.ButtonGroup BTG4;
    private javax.swing.ButtonGroup BTG5;
    private javax.swing.ButtonGroup BTG6;
    private javax.swing.JButton ButtonPlay;
    private javax.swing.JLabel LabelP1;
    private javax.swing.JLabel LabelP2;
    public javax.swing.JRadioButton RBP1;
    public javax.swing.JRadioButton RBP2;
    public javax.swing.JRadioButton RBP3;
    public javax.swing.JRadioButton RBP4;
    public javax.swing.JRadioButton RBP5;
    public javax.swing.JRadioButton RBP6;
    public javax.swing.JRadioButton RBT1;
    public javax.swing.JRadioButton RBT2;
    public javax.swing.JRadioButton RBT3;
    public javax.swing.JRadioButton RBT4;
    public javax.swing.JRadioButton RBT5;
    public javax.swing.JRadioButton RBT6;
    public javax.swing.JTextField TextFieldP1;
    public javax.swing.JTextField TextFieldP2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextNick1;
    private javax.swing.JTextField jTextNick2;
    private javax.swing.JTextField jTextNick3;
    // End of variables declaration//GEN-END:variables
}
