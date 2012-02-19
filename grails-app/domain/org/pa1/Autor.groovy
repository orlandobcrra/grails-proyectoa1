package org.pa1

class Autor {
    String nombre
    String email
    String sexo
    Short cantidadHijos
    Double sueldo
    Date fechaNacimiento
    /*
     * Default (injected) attributes of GORM
     */
    //	Long	id
    //	Date	dateCreated
    //	Date	lastUpdated
	
    //	static belongsTo	= []	// tells GORM to delete this object if the "parent" is deleted.
    //	static hasOne		= []
    //	static hasMany		= []	
    //	static mappedBy		= []
	
    static mapping = {
    }
    
    static constraints = {
        nombre size: 5..15, blank: false, unique: true
        email email: true, blank: true
        sexo inList: ["Masculino", "Femenino"]
        cantidadHijos range: 0..11
        sueldo scale: 2
        fechaNacimiento attributes: [year: 1980..2012]
    }
    
	
    /*
     * Methods of the Domain Class
     */
}
