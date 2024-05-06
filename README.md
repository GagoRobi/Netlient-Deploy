# Homework0.2 - Gágó Róbert

Ez a repository a teszt feladat deployolt verziója. Render.com -on tettem közzé az appot -> [https://netlient-deploy.onrender.com/](https://netlient-deploy.onrender.com/)<br/> <b><u> Ha a program működését szeretnétek tesztelni, ezen az oldalon megtehetitek</u></b> -> [https://netlient-deploy.onrender.com/](https://netlient-deploy.onrender.com/)
<br/>  Ez a repository a lokális verzió másolata, kicsit átalakítva, hogy műdöjön a deployolás után is.
Például endpointokat át kellett írni.
<br/> <b><u>Eredeti repository lokális futtatáshoz</b></u> (telepítési instrukciókkal együtt) -> https://github.com/GagoRobi/Homework-Netlient

Ezen a repositoryn megtaláljátok kódokat és telepítés nélkül ki tudjátok próbálni az appot.

Egyéb infók a kész projektről:
* `user` helyett `app_user` néven készítettem a felhasználók tábláját mert postgreSQL-en belül a "user" név levan foglalva a postgreSQL részére. Tábla oszlopai `id`,`username`,`password`.
* `adat` nevű tábla oszlopai az adatbázisban `id`,`name`,`price`,`vat`, de frontenden a kért magyar elnevezésekkel van megjelenítve.
* Az oszlop név mezőjére kattintva tudjátok változtatni hogy mi által és melyik irányba legyen rendezve.
* Paginationt is használtam, és a backenden történik az összes rendezés, és keresés. Azért készítettem így, mert nagyobb méretű adatbázisnál így hatékonyabb.
*  A felhasználó adataira nincs kikötés, szóval bármilyen név/jelszó kombinációt lehet regisztrálni.

Bármi kérdés merül fel keressetek nyugodtan.<br/>
Köszönöm a lehetőséget!
