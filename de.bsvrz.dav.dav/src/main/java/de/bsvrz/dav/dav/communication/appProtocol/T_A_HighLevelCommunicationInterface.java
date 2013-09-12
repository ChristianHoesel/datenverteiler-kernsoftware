/*
 * Copyright 2007 by Kappich Systemberatung, Aachen
 * Copyright 2004 by Kappich+Kni� Systemberatung, Aachen
 * 
 * This file is part of de.bsvrz.dav.dav.
 * 
 * de.bsvrz.dav.dav is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * de.bsvrz.dav.dav is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with de.bsvrz.dav.dav; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package de.bsvrz.dav.dav.communication.appProtocol;

import de.bsvrz.dav.daf.communication.lowLevel.telegrams.BaseSubscriptionInfo;
import de.bsvrz.dav.daf.communication.lowLevel.telegrams.ApplicationDataTelegram;
import de.bsvrz.dav.daf.communication.lowLevel.telegrams.RequestSenderDataTelegram;
import de.bsvrz.dav.dav.main.ServerHighLevelCommunication;

/**
 * Erweitert das Interface {@link de.bsvrz.dav.dav.main.ServerHighLevelCommunication}, um Funktionalit�t zwischen dem Transmitter und der Applikation.
 *
 * @author Kappich Systemberatung
 * @version $Revision: 5068 $
 */
public interface T_A_HighLevelCommunicationInterface extends ServerHighLevelCommunication {

	/**
	 * Gibt die Id des Datenverteilers zur�ck.
	 *
	 * @return Id des Datenverteilers
	 */
	public long getDataTransmitterId();

	/**
	 * Gibt die Id der Konfiguration zur�ck.
	 *
	 * @return Id der Konfiguration
	 */
	public long getConfigurationId();

	/**
	 * Gibt den Typ der Applikation zur�ck.
	 *
	 * @return Pid des Typs der Applikation
	 */
	public String getApplicationTypePid();

	/**
	 * Gibt den Namen der Applikation zur�ck.
	 *
	 * @return Name der Applikation
	 */
	public String getApplicationName();

	/**
	 * Gibt zur�ck, ob es sich um die Konfiguration handelt.
	 *
	 * @return <code>true</code>, wenn es sich um die Konfiguration handelt, sonst <code>false</code>
	 */
	public boolean isConfiguration();

	/**
	 * Diese Methode wird von der Verbindungsverwaltung aufgerufen, um eine Sendesteuerung an die Applikation weiterzuleiten. Aus den �bergebenen Parametern wird
	 * ein {@link RequestSenderDataTelegram}-Array gebildet und �ber die Telegrammverwaltung an die Applikation gesendet.
	 *
	 * @param data  Anmeldeinformationen
	 * @param state Benachrichtigungscode
	 *
	 * @see RequestSenderDataTelegram
	 */
	public void triggerSender(BaseSubscriptionInfo data, byte state);

	/**
	 * Sendet ein Telegramm �ber die Telegrammverwaltung zur Applikation.
	 *
	 * @param telegram Telegramm, das verschickt werden soll.
	 */

	public void sendData(ApplicationDataTelegram telegram);

	/**
	 * Sendet mehrere Telegramme �ber die Telegrammverwaltung zur Applikation.
	 *
	 * @param telegrams Telegramme, die verschickt werden sollen.
	 */
	public void sendData(ApplicationDataTelegram telegrams[]);
}

