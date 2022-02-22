/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
import Vista.FrmSeguimientoClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeguimientoClientes implements ActionListener{
  private FrmSeguimientoClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorSeguimientoClientes(FrmSeguimientoClientes view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        leyenda=_model.registrarAlta("tbusuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtUsuario.getText() +" ', "+_view.txtpsw.getText() );
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtId.setText(null);
_view.txtCedula.setText(null);

_view.txtpsw.setText(null);


_view.txtDireccionResidencial.setText(null);
_view.txtTipocartera.setText(null);

_view.txtNumFactura.setText(null);

_view.txtFechaHora.setText(null);


_view.txtSaldoRestante.setText(null);
_view.txtTipoCobro.setText(null);
_view.txtFechaAcuerdoUno.setText(null);
_view.txtAcuerdoUno.setText(null);

_view.txtVSeguro.setText(null);



_view.txtFechaAcuerdoDos.setText(null);
_view.txtAcuerdoDos.setText(null);
_view.txtFechaAcuerdoTres.setText(null);
_view.txtAcuerdoTres.setText(null);


}
}
