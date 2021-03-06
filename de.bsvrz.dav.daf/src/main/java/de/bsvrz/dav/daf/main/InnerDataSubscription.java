/*
 * Copyright 2011 by Kappich Systemberatung Aachen
 * 
 * This file is part of de.bsvrz.dav.daf.
 * 
 * de.bsvrz.dav.daf is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 * 
 * de.bsvrz.dav.daf is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with de.bsvrz.dav.daf; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package de.bsvrz.dav.daf.main;

import de.bsvrz.dav.daf.main.config.Aspect;
import de.bsvrz.dav.daf.main.config.AttributeGroup;
import de.bsvrz.dav.daf.main.config.AttributeGroupUsage;
import de.bsvrz.dav.daf.main.config.SystemObject;

/**
 * Kapselt eine Datenanmeldung f�r Daten auf dem Datenverteiler. F�r eine Transaktionsanmeldung als Quelle oder Senke muss dem Datenverteiler mitgeteilt
 * werden, welche inneren Daten diese Transaktion enthalten k�nnen soll. Daf�r ist diese Klasse gedacht.
 *
 * @author Kappich Systemberatung
 * @version $Revision: 8953 $
 */
public final class InnerDataSubscription {

	private final SystemObject _object;

	private final AttributeGroup _attributeGroup;

	private final Aspect _aspect;

	/**
	 * Erstellt eine neue InnerDataSubscription-Klasse
	 * @param object Objekt
	 * @param attributeGroup Attributgruppe
	 * @param aspect Aspekt
	 */
	public InnerDataSubscription(final SystemObject object, final AttributeGroup attributeGroup, final Aspect aspect) {
		_object = object;
		_attributeGroup = attributeGroup;
		_aspect = aspect;
	}

	/**
	 * Erstellt eine neue InnerDataSubscription-Klasse
	 * @param object Objekt
	 * @param attributeGroupUsage Attributgruppenverwendung
	 */
	public InnerDataSubscription(final SystemObject object, final AttributeGroupUsage attributeGroupUsage) {
		_object = object;
		_attributeGroup = attributeGroupUsage.getAttributeGroup();
		_aspect = attributeGroupUsage.getAspect();
	}

	/**
	 * Liefert das Objekt dieser Datenbeschreibung zur�ck.
	 *
	 * @return Objekt dieser Datenbeschreibung
	 */
	public SystemObject getObject() {
		return _object;
	}

	/**
	 * Liefert die Attributgruppe dieser Datenbeschreibung zur�ck.
	 *
	 * @return Attributgruppe dieser Datenbeschreibung
	 */
	public AttributeGroup getAttributeGroup() {
		return _attributeGroup;
	}

	/**
	 * Liefert den Aspekt dieser Datenbeschreibung zur�ck.
	 *
	 * @return Aspekt dieser Datenbeschreibung
	 */
	public Aspect getAspect() {
		return _aspect;
	}

	@Override
	public boolean equals(final Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;

		final InnerDataSubscription that = (InnerDataSubscription)o;

		if(_aspect != null ? !_aspect.equals(that._aspect) : that._aspect != null) return false;
		if(_attributeGroup != null ? !_attributeGroup.equals(that._attributeGroup) : that._attributeGroup != null) return false;
		if(_object != null ? !_object.equals(that._object) : that._object != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = _object != null ? _object.hashCode() : 0;
		result = 31 * result + (_attributeGroup != null ? _attributeGroup.hashCode() : 0);
		result = 31 * result + (_aspect != null ? _aspect.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "InnerDataSubscription{" + "object=" + _object + ", attributeGroup=" + _attributeGroup + ", aspect=" + _aspect + '}';
	}
}
