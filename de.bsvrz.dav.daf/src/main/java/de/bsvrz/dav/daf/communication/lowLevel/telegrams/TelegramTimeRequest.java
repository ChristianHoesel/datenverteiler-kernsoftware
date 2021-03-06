/*
 * Copyright 2007 by Kappich Systemberatung, Aachen
 * Copyright 2004 by Kappich+Kni� Systemberatung, Aachen
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

package de.bsvrz.dav.daf.communication.lowLevel.telegrams;

import de.bsvrz.dav.daf.main.impl.CommunicationConstant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Ermittlung der Telegrammlaufzeit. Mit diesem Systemtelegramm wird eine Anfrage zur Ermittlung der Telegrammlaufzeit zwischen einer Applikation und
 * dem zugeh�rigen Datenverteiler eingeleitet. Die Ermittlung der Telegrammlaufzeit ist in beiden Richtungen m�glich (siehe Telegrammlaufzeitantwort ).
 *
 * @author Kappich Systemberatung
 * @version $Revision: 5059 $
 */
public class TelegramTimeRequest extends DataTelegram {

	/** Die Zeit der Telegrammanfrage */
	private long telegramRequestTime;

	public TelegramTimeRequest() {
		type = TELEGRAM_TIME_REQUEST_TYPE;
		priority = CommunicationConstant.SYSTEM_TELEGRAM_PRIORITY;
	}

	/**
	 * Erzeugt neues TelegramTimeRequest
	 *
	 * @param time Zeitpunkt der Anfrage
	 */
	public TelegramTimeRequest(long time) {
		type = TELEGRAM_TIME_REQUEST_TYPE;
		priority = CommunicationConstant.SYSTEM_TELEGRAM_PRIORITY;
		telegramRequestTime = time;
		length = 8;
	}

	/**
	 * Gibt die Zeit der Durchsatzpr�ffung Anfrage an.
	 *
	 * @return Zeit der Durchsatzpr�ffung
	 */
	public final long getTelegramRequestTime() {
		return telegramRequestTime;
	}

	public final String parseToString() {
		String str = "Systemtelegramm Laufzeitsermittlung Anfrage: \n";
		str += "Zeit der Telegrammanfrage : " + telegramRequestTime + "\n";
		return str;
	}

	public final void write(DataOutputStream out) throws IOException {
		out.writeShort(length);
		out.writeLong(telegramRequestTime);
	}

	public final void read(DataInputStream in) throws IOException {
		int _length = in.readShort();
		telegramRequestTime = in.readLong();
		length = 8;
		if(length != _length) {
			throw new IOException("Falsche Telegramml�nge");
		}
	}
}

