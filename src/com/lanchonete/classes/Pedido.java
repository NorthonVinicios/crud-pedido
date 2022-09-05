/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lanchonete.classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByDataPedido", query = "SELECT p FROM Pedido p WHERE p.dataPedido = :dataPedido")
    , @NamedQuery(name = "Pedido.findByFormaPagamento", query = "SELECT p FROM Pedido p WHERE p.formaPagamento = :formaPagamento")
    , @NamedQuery(name = "Pedido.findByDataEntregaProgramada", query = "SELECT p FROM Pedido p WHERE p.dataEntregaProgramada = :dataEntregaProgramada")
    , @NamedQuery(name = "Pedido.findByDataEntregaEfetivada", query = "SELECT p FROM Pedido p WHERE p.dataEntregaEfetivada = :dataEntregaEfetivada")})
public class Pedido implements Serializable {

    @Column(name = "preco")
    private Integer preco;

    @JoinTable(name = "produto_pedido", joinColumns = {
        @JoinColumn(name = "pedido", referencedColumnName = "id_pedido")}, inverseJoinColumns = {
        @JoinColumn(name = "produto", referencedColumnName = "id_produto")})
    @ManyToMany
    private List<Produto> produtoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "data_pedido")
    private String dataPedido;
    @Column(name = "forma_pagamento")
    private Integer formaPagamento;
    @Column(name = "data_entrega_programada")
    private String dataEntregaProgramada;
    @Column(name = "data_entrega_efetivada")
    private String dataEntregaEfetivada;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente idCliente;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, String dataPedido) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataEntregaProgramada() {
        return dataEntregaProgramada;
    }

    public void setDataEntregaProgramada(String dataEntregaProgramada) {
        this.dataEntregaProgramada = dataEntregaProgramada;
    }

    public String getDataEntregaEfetivada() {
        return dataEntregaEfetivada;
    }

    public void setDataEntregaEfetivada(String dataEntregaEfetivada) {
        this.dataEntregaEfetivada = dataEntregaEfetivada;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lanchonete.classes.Pedido[ idPedido=" + idPedido + " ]";
    }

    @XmlTransient
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }
    
}
