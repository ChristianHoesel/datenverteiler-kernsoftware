Kernsoftware
============

Die Kernsoftware des Datenverteilers in Form eines Maven-Projekts. Der Zweck
dieses Projekts ist es, die Softwareinheiten (SWE) der Kernsoftware als
Maven-Artefakte zur Verf�gung zu stellen und so als Maven-Abh�ngigkeit nutzbar
zu machen.

Das Projekt beinhaltet die SWEs, die vom NERZ e.V. als Paket *Kernsoftware* zum
Download bereit gestellt werden.


Der *master* Branch
-------------------

Der *master* Branch enth�lt die Kernsoftware in Version 3.5.0 vom 15.04.2012.


Der *develop* Branch
--------------------

Der *develop* Branch umfasst gegen�ber dem *master* Branch folgende �nderungen:

- *de.bsvrz.dav.daf* wurde auf Version 3.5.5 vom 13.15.2012 aktualisiert.


Hinweise zur Maven-Konfiguration
--------------------------------

Die SWEs der Kernsoftware sind als Unterprojekte angelegt. Im Root-Projekt sind
alle gemeinsamen Einstellungen konfiguriert, einschlie�lich der Sektionen f�r
*build* und *reporting*.

In den Unterprojekten der SWEs sind nur vom Root-Projekt abweichende
Einstellungen konfiguriert. Insbesondere bei Reports ist im Root-Projekt der
aggregierte Report aktiviert und im Unterprojekt wieder deaktiviert.


---

F�r mehr Informationen zur bundeseinheitlichen Software f�r
Verkehrsrechnerzentralen (BSVRZ) siehe http://www.nerz-ev.de.
