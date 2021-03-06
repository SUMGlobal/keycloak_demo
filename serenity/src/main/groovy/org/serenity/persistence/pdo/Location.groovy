package org.serenity.persistence.pdo

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.NamedQueries
import javax.persistence.NamedQuery
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size
import javax.xml.bind.annotation.XmlRootElement


@Entity
@Table(name = 'location', catalog = 'serenity', schema = '')
@XmlRootElement
@NamedQueries([
    @NamedQuery(name = 'Location.findAll', query = 'SELECT l FROM Location l'),
    @NamedQuery(name = 'Location.findByName', query = 'SELECT l FROM Location l WHERE l.name = :name'),
    @NamedQuery(name = 'Location.findByAccess', query = 'SELECT l FROM Location l WHERE l.access = :access'),

])
@Canonical
@EqualsAndHashCode(excludes = ['id'])
class Location implements Serializable {
    private static final long serialVersionUID = 1L

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = 'id', nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @Size(max = 255)
    @Column(name = 'name', length = 255)
    String name

    @Basic(optional = false)
    @NotNull
    @Size(max = 7)
    @Column(name = "access", nullable = false, length = 7)
    private String access;

}
