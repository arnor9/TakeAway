# TakeAway
Námsmarkmið

Að forrita skiptingu á milli sena og fleiri en einn controller. 
Að forrita dialog og flutning gagna í og úr honum. 
Að forrita ListView 
Að forrita sérhæfða klasa (customized class) með erfðum 
Að nota stöðurit til að lýsa stýriflæðinu.  

Annað
Í fyrirlestri 6.2 fórum við yfir verkefnið. Upptakan er aðgengileg hér til vinstri í Panopto. 
Við gerðum þessa skissu hér. Það er sennilega nauðsynlegt fyrir ykkur að hlusta á fyrirlesturinn til að skilja hana. 

null (5).png

Verkefnið sem á að leysa

Forrita á pöntunarforrit fyrir takeaway mat. Notandi getur valið veitingar af matseðli,  gefið upp  hver afhendingarstaður er og séð hvað veitingarnar kosta. Notandi á að geta ef vill, loggað sig (skráð sig inn) inn á síðuna á pöntunarsíðu. 

Gagnvirkniskröfur

1. Notandi velur veitingar af matseðli sem settar eru í körfu. Matseðillinn birtast í viðmótshlut að eigin vali en valdar veitingar (karfan) birtast í   ListView með heiti og verði. Hægt er að eyða úr körfu. Matseðillinn og karfan birtast í sömu senu sem við köllum pöntunarsenu. 

2. Ef notandi hefur ekki skráð sig inn birtist táknmynd eða annað sem gefur til kynna að notandi geti skráð sig inn í pöntunarsenu. Notandi gefur upp lykilorð í dialog. Kerfið tékkar ekki á lykilorði þannig að hvaða lykilorð sem er dugar. Þegar notandi hefur skráð sig inn birtist nafn hans á síðunni og gefið til kynna að hann sé innskráður .

3. Ef notandi er ekki skráður notandi getur hann skráð sig sem nýjan notanda. Notandi gefur þá upp fullt nafn og heimilisfang í dialog. Notið eigið nafn í prófunum. 

4. Þegar notandi vill borga veitingar sem eru í körfu þá birtist ný sena sem sýnir heildarverð körfunnar og áætlaðan afhendingatíma.  (notið slembitíma). Við köllum þessa senu Greiðslusenu. Úr þessari senu er hægt að fara aftur í pöntunarsenuna og skoða eða breyta. Ef notandi hins vegar staðfestir pöntun í Greiðslusenunni þá koma staðfestingaskilaboð og karfan er tæmd. 

5. Reynið að hafa hnappa virka / óvirka eins og við á. 

Útlitskröfur 

ListView er notað til að sýna körfu
Þið ráðið útliti fyrir matseðil með veitingum. Hægt er t.d. að nota ListView en þið ráðið því.  
Matseðill og karfa er sýnd í sömu senu pöntunarsenu 
Login eða Skráning  notanda er gert í Dialog. 
Upphæð, afhendingarstaður og áætlaður afhendingartími er gefinn upp í greiðslusenu 
Vandið hönnun útlitsins. Gætið t.d. að bili á milli viðmótshluta, stærð viðmótshluta og útliti.
Notið samræmda litapallettu og takmarkið fjölda lita við 5+/-2 
Forritunarkröfur

Aðalklasinn heitir TakeAwayApplication.
Notið  controllera, PontunController fyrir pöntunarsenu (pontun-view.fxml) og  GreidslaController fyrir greiðslusenu (greidsla-view.fxml)
Hafið klasa VidskiptavinurDialog (vidskipti-view.fxml) sem erfir frá Dialog<Vidskiptavinur> Klasinn les inn .fxml skrá þar sem DialaogPane er rótarklasinn. 
Búið til endurnýtanlegan klasa fyrir matseðilshluta pöntunarsenunnar sem þið gætuð notað í öðru kerfi. Hafið sérhæfðan klasa (customized class) fyrir Matseðilhluta pöntunarsenunnar. Kallið klasann MatsedillView. Klasinn erfir (extends) frá klasanum sem er í rótinni á matseðlinum. Matseðill hefur sérstaka .fxml skrá sem heitir matsedill-view.fxml Í pontun-view.fxml skránni hafið þið viðmótshlut af klasanum MatsedillView. 
Þið ráðið hvort þið hafið sérklasa fyrir LoginDialog.
Þið fáið klasana ViewSwitcher og View eftir Almas Baimagambetov (Sjá MultipleView dæmið úr viku 5.1) sem hefur verið breytt lítilsháttar   fyrir þetta verkefni
Í vinnslu pakkanum skuluð þið hafa klasann Veitingar. Klasinn hefur tvö svið, heiti veitinga (strengur) og verð (heiltala).   Síðan höfum við klasana Karfa og Matsedill . Karfa er observable  listi af Veitingar. Matsedill er líka observable listi af Veitingar. Karfa er eins og Matsedill nema hann getur reiknað út verð körfunnar til viðbótar. Notið erfðir. Karfa erfir frá Matsedill.  Einnig skuluð þið hafa klasann Vidskiptavinur sem hefur tvö svið bæði strengur, nafn og heimilisfang.  Heimilisfang (ein breyta)  er götuheiti og húsnúmer (önnur breyta) . Setjið flest ef ekki öll gögn í klösunum sem properties þannig að hægt sé að binda þau við notendaviðmótið.  
Hafið einn pakka (e. package) hi.verkefni.vidmot (eða xxx.yyy.vidmot - má líka vera bara vidmot). 

Notist við góðar forritunarvenjur. Hafið aðferðir stuttar. Forðist endurtekinn kóða. Hjálparaðferðir eiga að vera private. Allar tilviksbreytur eiga að vera private og hafa get og set-aðferðir ef á þarf að halda. Hafið klasa með stórum upphafsstaf og breytur og aðferðir með litlum upphafsstaf.
Skjalið klasana, tilviksbreytur og aðferðir með JavaDoc aðferð.
Prófanakröfur 

Sýnið skjáskot fyrir hverja stöðu (e. state) kerfisins samkvæmt stöðuriti ykkar. Birtið stöðuritið .
Notið ykkar nafn sem viðskiptavin. 

Námsmat

Það er gefin einkunn fyrir útlit,  gagnvirkni,  forritun og prófanir forrits. Ef forrit þýðir (e. compile) ekki fæst ekkert fyrir gagnvirkni og forritun. Gætið þess að prófa forritið vel þannig að það krassi ekki.  Verkefnið er einstaklingsverkefni. Forritið það sjálf. 
Sjá stigagjöf á gradescope. Með fyrirvara um hugsanlegar breytingar.

Skila

Skilaðu í Gradescope IntelliJ verkefni sem kennari getur keyrt og PDF skrá með skjáskoti af keyrslu.  Sjáðu leiðbeiningar hér.

Það er gefið svigrúm til að skila tveimur dögum eftir skilafrest en dregið er niður um 0.25 fyrir hvern byrjaðan sólarhring




Dæmablað 1:


Námsmarkmið

Að forrita skiptingu á milli sena og fleiri en einn controller. 
Að forrita dialog og flutning gagna í og úr honum. 
Að forrita ListView 
Að forrita sérhæfða klasa (customized class) með erfðum 
Að nota stöðurit til að lýsa stýriflæðinu.  

Námsefni 

Vertu búin að kynna þér efni fyrirlestra  5.1 , 5.2  5.3 og  6.1  6.2 og forritin sem er farið yfir í þeim.

Verkefni

Verkefni 3  Vertu búin að kynna þér vel verkefnið. 

Framkvæmd

Reyndu að gera sem mest af skrefunum sjálf(ur/t) en við hvetjum þig til að tala við samnemendur og kennara og biðja þau um útskýringu ef þig vantar hjálp.  


Hér á eftir eru skref sem þú getur framkvæmt. En þú getur líka farið þína eigin leið til að ná markmiðinu. Þú getur breytt nöfnum á aðferðum og klösum ef þér finnst það mikilvægt. Gættu þín samt að fara eftir CamelCase nafnavenjum.  En athugaðu að það er auðveldara fyrir kennarana að aðstoða þig og fara yfir verkefnið ef þú fylgir nafnatillögunum.

---

Stofnaðu nýtt verkefni í IntelliJ, File / New Project / JavaFX - Endurskírðu sjálfgefnu klasana þannig að þú hafir eftir þetta skref TakeAwayApplication, PontunController, nýjan pakka xxxx.vinnsla eða vinnsla og pontun-view.fxml 
Byrjum á vinnslunni. Þetta er smá handavinna en að mestu leyti úr eldra efni. Gott að ljúka því. Það eina sem þú þarft að athuga að tilviksbreyturnar eiga allar að vera property, t.d. 
private StringProperty nafn = new SimpleStringProperty();

Skrifaðu klasann Vidskiptavinur. Láttu IntelliJ um að framleiða kóðann (hægri smella / Generate) en hreinsaðu svo út í lok verkefnis það sem þú notar ekki. 
Skrifaðu klasann Veitingar. í hlut af klasanum er eitt atriði t.d. Margarita pizza, 2990. Skrifaðu aðferðina toString() eins og þið viljið að veitingarnar birtist í lista. 
Skrifaðu klasann Matsedill og hafðu eina tilviksbreytu sem er af klasanum  ObservableList<Veitingar>. Mundu að upphafsstilla breytuna.
protected ObservableList<Veitingar> veitingar = FXCollections.observableArrayList();
Skrifaðu t.d. aðferðina setjaGogn() og smíðaðu nokkrar veitingar til að setja í listann. Ef þú treystir þér til geturðu lesið gögnin úr skrá. Gættu þess bara að skráarslóðin sé relative og í resources. 
Skrifaðu klasann Karfa sem erfir frá (extends) Matsedill og bættu við einni heiltölu property breytu fyrir heildarverðið. Skrifaðu get-aðferð á heildarverðið. 

Ef þú treystir þér til geturðu sett ListChangeListener á heildarverðið sem uppfærist þegar veitingum er bætt við eða eytt er úr körfu. Þetta er efni úr viku 4. Annars skaltu skrifa aðferð reiknaHeildarverd á Karfa sem ítrar yfir listann og reiknar heildarverðið. 
Nú þegar þú ert búin að setja upp beinagrindina af vinnslunni skaltu skrifa main fall í Karfa klasann sem gerir lítið prófunarforrit. Hér geturðu notað einfaldan debugger. 

Nú skaltu hefjast handa við að hanna og forrita notendaviðmótið. Gerðu handteiknaðar skissur af pöntunarviðmótinu, greiðsluviðmótinu og innskráningar dialog. Þú skalt hafa hönnunina einfalda - þú getur alltaf gert hana betri  seinna ef þú hefur tíma. 

Þú skalt gera einfalt stöðurit til að þú áttir þig betur á hvernig þú ferðast á milli senanna tveggja (pöntun og greiðslu) og dialogana. Þetta mun seinna hjálpa þér að gera viðeigandi hnappa virka/óvirka.
Gerðu núna sérhæfðan klasa MatsedillView og matsedill-view.fxml skrá fyrir matseðilinn eingöngu - þessi skrá hefur eftirfarandi í rót viðmótstrésins

 <fx:root type="nafnið á javafx viðmótsklasanum sem Matsedill erfir frá "

t.d. ef Matseðillinn er bara ListView þá gerirðu
<fx:root type="javafx.scene.control.ListView" .....

en þú getur haft matseðilinn hvernig sem þú vilt svo fremi sem hægt er að velja af honum veitingar 



Skoðaðu skissurnar þínar. Skrifaðu MatsedillView klasann sem erfir frá  (extends) klasanum sem þú valdir í matsedill-view.fxml 
Skrifaðu smið í klasann sem les inn .fxml skrána og setur controllerinn og rótina sem this. 
Í smiðnum á MatsedillView geturðu búið til Matsedill local hlut og sett gögn í hann ( setjaGogn()  sbr í fyrra skrefi ).  
Síðan þarftu að tengja  gögnin (með vöktun) úr Matsedill í MatsedillView og tengja með reglu. T.d. ef þú notar ListView þá gerirðu 
einfaldlega setItems(m.getVeitingar) þar sem m er Matsedill hluturinn sem þú varst að búa til. Ef þú notar annað en ListView þá gerirðu eitthvað sambærilegt. 

Gerðu núna notendaviðmótið fyrir aðalsíðuna - pontun-view.fxml . Hér á matseðillinn að vera og karfan. Rifjaðu upp frá verkefnislýsingu hvað á að vera, t.d. login. Athugaðu vel að í þessari .fxml skrá á að vera MatsedillView hlutur sbr. 

<MatsedillView ......>

Forritaðu PontunController klasann og gerðu beinagrind af helstu handlerum, t.d.  fxSetjaKorfuHandler, fxTakaUrKorfuHandler, fxInnskraningHandler skilgreindu þá í pontun-view.fxml sem action event handlerar á viðmótshluti þar 

Eftir því sem þú forritar handlerana skilgreindu nauðsynlegar tilviksbreytur fyrir viðmótshluti sem þú ætlar að nota í aðferðunum 
Skilgreindu  tilviksbreytur fyrir vinnsluhluti sem þú þarft á að halda. 

Forritaðu initialize () aðferðina í PontunController. Tengdu viðmót og vinnslu með reglum (bind) þar sem það á við, t.d. verðið í körfunni 
Forritaðu handlerana fyrir að setja í körfu og taka úr körfu 
Nú eru allflestir klasar komnir (VidskiptavinurDIalog og LoginDialog koma á næsta blaði). Gerðu skissu af kassamynd af klösunum. 
 

Ef þú hefur lokið skrefunum að ofan þá hefurðu náð góðum árangri. Ef það er meiri tíma skaltu halda áfram. Annars skaltu ljúka við verkefnið heima eða fara í annan dæmatíma. Ef þú hefur spurningar á milli dæmatíma þá geturðu spurt í fyrirlestri eða á Ed  Ef þú vilta að við skoðum kóðann þinn er best að senda í Gradescope. 
