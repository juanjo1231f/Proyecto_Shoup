package org.example

class CUsuario(valores:ArrayList<String>) {
    //Variables
    private var id:Int?=0
    private var nombre:String?=""
    private var apepat:String?=""
    private var apemat:String?=""
    private var correo:String?=""
    private var fecnac:String?=""
    private var sexo:String?=""
    private var estado:String?=""
    private var fotper:String?=""
    private var passwd:String?=""
    private var status:Int?=0

    //Constructor
    init {
    
    }

    //Setters
    protected fun setId(dato:Int){
        this.id = dato
    }

    protected fun setNombre(dato:String){
        this.nombre = dato
    }
    protected fun setApepat(dato:String){
        this.apepat = dato
    }
    protected fun setApemat(dato:String){
        this.apemat = dato
    }
    protected fun setCorreo(dato:String){
        this.correo = dato
    }
    protected fun setFecnac(dato:String){
        this.fecnac = dato
    }
    protected fun setSexo(dato:String){
        this.sexo = dato
    }
    protected fun setEstado(dato:String){
        this.estado = dato
    }
    protected fun setFotper(dato:String){
        this.fotper = dato
    }
    protected fun setPasswd(dato:String){
        this.passwd = dato
    }
    protected fun setStatus(dato:Int){
        this.status = dato
    }

    //Getters
    protected fun getId():Int{
        return this.id!!
    }
    protected fun getNombre():String{
        return this.nombre!!
    }
    protected fun getApepat():String{
        return this.apepat!!
    }
    protected fun getApemat():String{
        return this.apemat!!
    }
    protected fun getCorreo():String{
        return this.correo!!
    }
    protected fun getFecnac():String{
        return this.fecnac!!
    }
    protected fun getSexo():String{
        return this.sexo!!
    }
    protected fun getEstado():String{
        return this.estado!!
    }
    protected fun getFotper():String{
        return this.fotper!!
    }
    protected fun getPasswd():String{
        return this.passwd!!
    }
    protected fun getStatus():Int{
        return this.status!!
    }

    //Funciones
}