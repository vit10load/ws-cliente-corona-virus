
package com.br.teste.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReturnOnePersonResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReturnOnePersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UmaPessoaRetornada" type="{http://service.ws.teste.br.com/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnOnePersonResponse", propOrder = {
    "umaPessoaRetornada"
})
public class ReturnOnePersonResponse {

    @XmlElement(name = "UmaPessoaRetornada")
    protected Pessoa umaPessoaRetornada;

    /**
     * Obtém o valor da propriedade umaPessoaRetornada.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getUmaPessoaRetornada() {
        return umaPessoaRetornada;
    }

    /**
     * Define o valor da propriedade umaPessoaRetornada.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setUmaPessoaRetornada(Pessoa value) {
        this.umaPessoaRetornada = value;
    }

}
