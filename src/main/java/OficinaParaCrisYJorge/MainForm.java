
package OficinaParaCrisYJorge;

import com.aspose.pdf.Document;
import com.aspose.pdf.FontRepository;
import com.aspose.pdf.TextFragment;
import com.aspose.pdf.TextFragmentAbsorber;
import com.aspose.pdf.TextFragmentCollection;
import com.aspose.pdf.TextSearchOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class MainForm extends javax.swing.JFrame {
    
    
    public MainForm() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_apellido_destinatario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccion_destinatario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ciudad_destinatario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre_apellido_remitente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direccion_remitente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        formasdepago = new java.awt.Choice();
        aceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Destinatario");

        jLabel2.setText("Nombre y Apellido");

        nombre_apellido_destinatario.setName(""); // NOI18N

        jLabel3.setText("Dirección");

        jLabel4.setText("Ciudad");

        jLabel5.setText("Remitente");

        jLabel6.setText("Nombre y Apellido");

        jLabel7.setText("Dirección");

        jLabel8.setText("Observaciones");

        jLabel9.setText("Forma de pago");

        formasdepago.add("forma pago 1");
        formasdepago.add("forma de pago 2");
        formasdepago.add("forma de pago 3");

        aceptar.setText("Aceptar");
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
        });
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel10.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_apellido_destinatario)
                            .addComponent(direccion_destinatario)
                            .addComponent(ciudad_destinatario)
                            .addComponent(nombre_apellido_remitente)
                            .addComponent(direccion_remitente)
                            .addComponent(tel, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formasdepago, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_apellido_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_apellido_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formasdepago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(aceptar)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
        String observaciones_final ;
        String tel_final;
        if(observaciones.getText().equals("")){
            observaciones_final = "-";
        }else{
            observaciones_final= observaciones.getText();
        }
        if (tel!=null){
            tel_final = "-";
        }else{
            tel_final = tel.getText();
        }
        if(Validar()){// validar solo pregunta si estan llenos los casilleros obligatorios. 
            
            
            // creao el PDF nuevo que después va a ser imprimido //
            Inicializar();
            setNombreDestinatario(nombre_apellido_destinatario.getText());
            setDireccionDestinatario(direccion_destinatario.getText());
            setLocalidadDestino(ciudad_destinatario.getText());
            setObservasiones(observaciones_final);
            setFormaDePago(formasdepago.getSelectedItem());
            setFecha();
            Commit();
            
           // fin crear documento
      
                                   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Error, no todos los casilleros obligatorios estan llenos.");
        }
        
    }//GEN-LAST:event_aceptarMouseClicked

    public boolean Validar(){
        
        return !(ciudad_destinatario.getText().equals("") && direccion_destinatario.getText().equals("") 
                && direccion_remitente.getText().equals("") 
                && nombre_apellido_destinatario.getText().equals("") &&
                nombre_apellido_remitente.getText().equals(""));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }
    
    
        public void Inicializar(){
        try {
            document = new Document(new FileInputStream("D:/pdf/source.pdf"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error,intente de nuevo mas tarde");
        }
    }
    
    // todos los metodos set* buscan en un pdf inicial la expresión regular correspondiente
    // y la intercambian por el valor ingresado por el usuario.
    
    
    public void setNombreDestinatario(String nombre_destinatario){
        TextFragmentAbsorber textAbsorber =
                new TextFragmentAbsorber("$nombre_apellido_destinatario$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(nombre_destinatario);
            textfragment.getTextState().setFont(FontRepository
                    .findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
        
    }
    public void setDireccionDestinatario(String direccion_destinatario){
        TextFragmentAbsorber textAbsorber =
                new TextFragmentAbsorber("$direccion_destinatario$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(direccion_destinatario);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
    public void setNro(String nro){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$nro$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(nro);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
        
    public void setPiso(String piso){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$piso$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(piso);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }    
    
    
    public void setDpto(String Dpto){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$$dto$$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(Dpto);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
    
    public void setLocalidadDestino(String localidad_destino){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$$localidad_destino$$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(localidad_destino);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
    
     public void setObservasiones(String observasiones){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$$observasiones$$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(observasiones);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
     
     
    public void setFormaDePago(String formadepago){
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$formadepago$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(formadepago);
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(11);
        }
    }
         
         
    public void setFecha(){
        Date objDate = new Date();
        String strDateFormat = "dd.MM.aa";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        TextFragmentAbsorber textAbsorber = new TextFragmentAbsorber("$fecha$");
        TextSearchOptions options = new TextSearchOptions(true);
        textAbsorber.setTextSearchOptions(options);
        document.getPages().accept(textAbsorber);
        TextFragmentCollection collection = textAbsorber.getTextFragments();
        for(TextFragment textfragment: (Iterable<TextFragment>) collection){
            textfragment.setText(objSDF.format(objDate));
            textfragment.getTextState().setFont(FontRepository.findFont("Calibri"));
            textfragment.getTextState().setFontSize(18);
        }
    }
    
    public void Commit(){// confirma los cambios hechos por los .set* y crea un nuevo archivo con los cambios realizados. 
      document.save("D:/pdf/update.pdf");
        
    }
    
    public void Print(){// envia el archivo pdf a imprimir, ATENCION!!!
        // solo puede usarse si antes se utilizo el metodo Commit()
        // si no, tendremos una excepción
    }
    

    private Document document;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField ciudad_destinatario;
    private javax.swing.JTextField direccion_destinatario;
    private javax.swing.JTextField direccion_remitente;
    private java.awt.Choice formasdepago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_apellido_destinatario;
    private javax.swing.JTextField nombre_apellido_remitente;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
