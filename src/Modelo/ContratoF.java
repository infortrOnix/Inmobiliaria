package Modelo;

import java.sql.Date;

public class ContratoF {
    
    private Date fechaInicial,fechaFinal;
    private String estado;
    private int idContrato;
    private Inquilino idInquilino;
    private Inmueble idInmueble;
    
    public void setFechaInicial(Date fechaInicial){this.fechaInicial=fechaInicial;}
    public void setFechaFinal(Date fechaFinal){this.fechaFinal=fechaFinal;}
    public void setestado(String estado){this.estado=estado;}
    public void setidContrato(int idContrato){this.idContrato=idContrato;}
    public void setIdInquilino(Inquilino idInquilino){this.idInquilino=idInquilino;}
    public void setIdImueble(Inmueble inmuble){this.idInmueble=idInmueble;}
    
    public Date getFechaInicial(){return fechaInicial;}
    public Date getFechaFinal(){return fechaFinal;}
    public String getEstado(){return estado;}
    public int getIdContrato(){return idContrato;}
    public Inquilino getIdInquilino(){return idInquilino;}
    public Inmueble getIdInmueble(){return idInmueble;}
    
    public ContratoF(){}
    
    public ContratoF(Date fechaInicial,Date fechaFinal,String estado,int idContrato,Inquilino idInquilino,Inmueble idInmueble)
    {
        this.fechaInicial=fechaInicial;
        this.fechaFinal=fechaFinal;
        this.estado=estado;
        this.idContrato=idContrato;
        this.idInmueble=idInmueble;
        this.idInquilino=idInquilino;
    }
    
    
    
    
}
