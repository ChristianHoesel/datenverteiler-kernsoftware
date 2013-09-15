/*
 * Copyright 2011 by Kappich Systemberatung Aachen
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

package de.bsvrz.dav.dav.main;

import de.bsvrz.dav.daf.communication.lowLevel.telegrams.BaseSubscriptionInfo;
import de.bsvrz.dav.daf.communication.lowLevel.telegrams.TransmitterDataTelegram;

/**
 * Schnittstelle f�r die Transaktionen, die der Subscriptionsmanager implementieren sollte
 *
 * @author Kappich Systemberatung
 * @version $Revision: 8633 $
 */
public interface SubscriptionsManagerTransactionInterface {

	/**
	 * Sendet ein Telegram. Wird vom DavTransactionManager benutzt, um manuell Telegramme mit einem vorgegebenen Datenindex zu senden.
	 * @param isSource TBD Bedeutung des Parameters wird aus dem Subscriptionsmanager nicht ganz klar. Eigentlich w�rde man erwarten, dass er bei einer Quelle true ist, ist er aber auch bei einer Sender-Senke-Konstellation
	 * @param dataTelegrams Telegramm (oder mehrere falls gesplittet)
	 */
	void sendTelegramsAsCentralDistributor(
			boolean isSource, TransmitterDataTelegram[] dataTelegrams);

	/**
	 * Gibt die n�chste laufende monoton steigende Datennummer f�r eine gegebene Anmeldung zur�ck damti ein Datenindex generiert werden kann.
	 * TBD: Falls der SubscriptionsManager verbessert wird, sollte (z.B. im SubscriptionsManager oder einer anderen Klasse stattdessen eine Methode geben,
	 * TBD: die den kompletten DatenIndex auf vern�nftige Weise generiert.
	 *
	 * @param info Anmeldungs-Info
	 *
	 * @return Eine Zahl von 1 bis 0x3FFFFFFF
	 *
	 * @throws ArithmeticException bei einem �berlauf der Nummer. In dem Fall sollte 1 als Ergebnis angenommen werden und der Zeitstempel des Datenindex erh�ht
	 *                             werden, um Monotonie sicherzustellen
	 */
	int getDataIndexIndex(BaseSubscriptionInfo info);
}
