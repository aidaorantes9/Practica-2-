    

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class presentacion extends javax.swing.JFrame {
    
    

    private Timer time; 
    private int sec = 0; 
    private int min = 0; 
    private BufferedReader lector; 
    private String line; 
    private String part[] = null; 
    public String vectorNombres[];
    public int vectorNumeros[]; 
    int contNumeros = 0; 
    int contNombres = 0; 
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    hilos h1 = new hilos(); 
    
    
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           sec ++; 
            if (sec == 60) {
                min ++; 
                sec = 0; 
            }
            if (min == 60) {
                min = 0;
            }
            tiempoactual();
        }
    };
    
    
    private void tiempoactual(){
            String texto = (min<=9?"0":"") + min + ":" + (sec<=9?"0":"") + sec   ; 
            etiqueta.setText(texto);

    }      
 
    public presentacion() {
        initComponents();
        time = new Timer (1000,acciones);      
    }
    
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiqueta = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jToggleButton6 = new javax.swing.JToggleButton();
        txTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jToggleButton7 = new javax.swing.JToggleButton();
        txExaminar = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(30, 30, 550, 300);

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRONÓMETRO");

        etiqueta.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta.setText("00:00");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel13);
        jPanel13.setBounds(100, 350, 210, 80);

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASOS");

        etiqueta1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta1.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel15);
        jPanel15.setBounds(330, 350, 170, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 170, 610, 460);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setAutoscrolls(true);
        jPanel9.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1);
        jButton1.setBounds(20, 10, 130, 50);

        jPanel3.add(jPanel9);
        jPanel9.setBounds(20, 370, 170, 70);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setAutoscrolls(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Nombre y Apellido");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Carné");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.add(jPanel11);
        jPanel11.setBounds(20, 10, 170, 130);

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setForeground(new java.awt.Color(0, 204, 204));
        jPanel16.setAutoscrolls(true);
        jPanel16.setLayout(null);

        jRadioButton3.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Merge Sort");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton3);
        jRadioButton3.setBounds(20, 30, 120, 28);

        jRadioButton4.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Quick Sort");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton4);
        jRadioButton4.setBounds(20, 60, 120, 28);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("tipo de algoritmo");
        jPanel16.add(jLabel5);
        jLabel5.setBounds(20, 10, 123, 17);

        jPanel3.add(jPanel16);
        jPanel16.setBounds(20, 260, 170, 100);

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setAutoscrolls(true);

        jRadioButton5.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Ascendente");

        jRadioButton6.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Descendente");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("sentido de ordenacion");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel3.add(jPanel17);
        jPanel17.setBounds(20, 150, 170, 100);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(660, 170, 210, 460);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setAutoscrolls(true);
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRÁCTICA NO. 2 ");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(290, 0, 530, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 10, 830, 40);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setAutoscrolls(true);
        jPanel7.setLayout(null);

        jToggleButton6.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("GENERAR GRÁFICA");
        jToggleButton6.setToolTipText("");
        jToggleButton6.setActionCommand("");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jToggleButton6);
        jToggleButton6.setBounds(580, 10, 238, 25);

        txTitulo.setText("tituloooo");
        txTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTituloActionPerformed(evt);
            }
        });
        jPanel7.add(txTitulo);
        txTitulo.setBounds(200, 10, 360, 24);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Ingrese Título de la Gráfica:");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 10, 210, 20);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(30, 110, 830, 40);

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setAutoscrolls(true);
        jPanel18.setLayout(null);

        jToggleButton7.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("EXAMINAR");
        jToggleButton7.setActionCommand("");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(jToggleButton7);
        jToggleButton7.setBounds(580, 10, 238, 25);

        txExaminar.setText("C:\\Users\\aidao\\Downloads\\prueba.csv");
        jPanel18.add(txExaminar);
        txExaminar.setBounds(10, 10, 550, 24);

        jTextField6.setText("jTextField3");
        jPanel18.add(jTextField6);
        jTextField6.setBounds(10, 10, 550, 24);

        jPanel1.add(jPanel18);
        jPanel18.setBounds(30, 60, 830, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        //
        
        
        String tit = txTitulo.getText();

        try {

            lector = new BufferedReader(new FileReader(txExaminar.getText()));

            String encabezado = lector.readLine();
            String titulo[] = encabezado.split(",");
            String tit1 = titulo[0];
            String tit2 = titulo[1];
            String contenido = "";  
            while((line = lector.readLine()) != null){
                contenido += line + ","; 
                
            }
             
                part = contenido.split(",");
                vectorNombres = new String[part.length/2];
                vectorNumeros = new int[part.length/2]; 
                
                for (int i = 0; i < part.length; i++) {

                   
                       if (i%2!=0){
                            vectorNumeros[contNumeros] = Integer.parseInt(part[i]);
                            contNumeros++; 
                       }else{
                            vectorNombres[contNombres] = part[i]; 
                            contNombres++; 
                       }  
                }
                
                
                contNombres = 0; 
                contNumeros = 0; 
                int numero=0; 
                String nombre= "";
                for (int i = 0; i < part.length; i++) {
                    
                    if (i%2!=0){
                        numero = vectorNumeros[contNumeros];
                        contNumeros++; 
                   }else{
                        nombre = vectorNombres[contNombres]; 
                        contNombres++; 
                   }  
                    datos.setValue(numero,"mate",nombre);
                }
                System.out.println();
            
            for (int i = 0; i<vectorNumeros.length; i++){
                System.out.println(vectorNombres[i] + " - " + vectorNumeros[i]);
            }

            
            JFreeChart grafica = ChartFactory.createBarChart3D(
            tit,
            tit1,
            tit2,
            datos,
            PlotOrientation.VERTICAL,
            true,
            true,
            false);

            ChartPanel panel = new ChartPanel(grafica);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(500,300));

            jPanel14.setLayout(new BorderLayout());
            jPanel14.add(panel,BorderLayout.NORTH);
            jPanel14.revalidate();
            jPanel14.repaint();
            lector.close();
            line = null;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        
        
        
        
       
        
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            txExaminar.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void txTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        time.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
         
        hilos ob = new hilos();
        ob.sort(vectorNumeros,vectorNombres, 0, vectorNumeros.length - 1 );
  
        System.out.println("\nSorted array");
        ob.printArray(vectorNumeros,vectorNombres);
        System.out.println(vectorNumeros.length);
    }//GEN-LAST:event_jRadioButton3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presentacion().setVisible(true);
            }
        }); 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JTextField txExaminar;
    private javax.swing.JTextField txTitulo;
    // End of variables declaration//GEN-END:variables

    private void printArray(int[] arr) {
       
    }

   
}
