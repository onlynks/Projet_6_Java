
package com.projet3.library_webapp.library_webapp_model.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getBookListResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getBookListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://library_webservice_service.library_webservice.projet3.com/}mapWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookListResponse", propOrder = {
    "_return"
})
public class GetBookListResponse {

    @XmlElement(name = "return")
    protected MapWrapper _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link MapWrapper }
     *     
     */
    public MapWrapper getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link MapWrapper }
     *     
     */
    public void setReturn(MapWrapper value) {
        this._return = value;
    }

}
