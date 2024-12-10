# Conversor de Monedas

¡Bienvenidos al Conversor de Monedas! 
Este es un proyecto en Java que permite realizar conversiones entre diferentes monedas utilizando la API de ExchangeRate.



## Descripción

Este programa permite a los usuarios seleccionar una moneda de origen y una moneda de destino para realizar la conversión, por medio de la API de ExchangeRate y asi obtener los tipos de cambio actualizados para calcular el monto monetario convertido.


## Características

1. Selección de monedas comunes de origen y destino.
2. Conversión entre múltiples monedas que puedes seleccionar en el siguiente listado:
   
    AED	Dírham de los Emiratos Árabes Unidos        AFN	Afgano afgano
    ALL	Lek albanés                                 AMD	Dram armenio
    ANG	Florín de las Antillas Neerlandesas         AOA	Kwanza angoleño
    ARS	Peso argentino                              AUD	Dólar australiano
    AWG	Florín de Aruba                             AZN	Manat azerbaiyano
    BAM	Bosnia y Herzegovina marca                  BBD	Dólar de Barbados
    BDT	Taka de Bangladesh                          BGN	Lev búlgaro
    BHD	Dinar bahreiní                              BIF	Franco burundiano
    BMD	Dólar de Bermudas                           BND	Dólar de Brunei
    BOB	boliviano boliviano                         BRL	Real brasileño
    BSD	Dólar de las Bahamas                        BTN	Ngultrum butanés
    BWP	Pula de Botsuana                            BYN	Rublo bielorruso
    BZD	Dólar beliceño                              CAD	Dólar canadiense
    CDF	Franco congoleño                            CHF	Franco suizo
    CLP	Peso chileno                                CNY	renminbi chino
    COP	Peso colombiano                             CRC	Colón costarricense
    CUP	Peso cubano                                 CVE	Escudo de Cabo Verde
    CZK	Corona checa                                DJF	Franco de Yibuti
    DKK	Corona danesa                               DOP	Peso dominicano
    DZD	Dinar argelino                              EGP	Libra egipcia
    ERN	Nakfa de Eritrea                            ETB	Birr etíope
    EUR	Euro                                        FJD	Dólar de Fiji
    FKP	Libra de las Islas Malvinas                 FOK	Corona de las Islas Feroe
    GBP	Libra esterlina                             GEL	Lari georgiano
    GGP	Libra de Guernsey                           GHS	Cedi de Ghana
    GIP	Libra de Gibraltar                          GMD	Dalasi de Gambia
    GNF	Franco guineano                             GTQ	Quetzal guatemalteco
    GYD	Dólar guyanés                               HKD	Dólar de Hong Kong
    HNL	Lempira hondureña                           HRK	Kuna croata
    HTG	Gourde haitiano                             HUF	Florín húngaro
    IDR	Rupia indonesia                             ILS	Nuevo shekel israelí
    IMP	Libra manesa                                INR	Rupia india
    IQD	Dinar iraquí                                IRR	Rial iraní
    ISK	Corona islandesa                            JEP	Libra de Jersey
    JMD	Dólar jamaiquino                            JOD	Dinar jordano
    JPY	Yen japonés                                 KES	Chelín keniano
    KGS	Som kirguís                                 KHR	Riel camboyano
    KID	Dólar de Kiribati                           KMF	Franco comorense
    KRW	Won surcoreano                              KWD	Dinar kuwaití
    KYD	Dólar de las Islas Caimán                   KZT	Tenge kazajo

4. Manejo de errores para entradas inválidas

## Funcionalidad del conversor de monedas


- `Funcionalidad 1`: Tiene una conexión con la API de la página Exchange Rates para sustrear el valor del tipo de moneda.
- `Funcionalidad 2`: Contiene siete opciones para realizar conversiones con diferentes tipos de moneda internacional.
- `Funcionalidad 3`: Muestra como resultado los dos tipos de monedas seleccionada, el monto introducido y la cantidad convertida.
- `Funcionalidad 4`: Cuenta con una opcion numero 8 para salir, lo cual finaliza la ejecucion de la aplicación.
   


## Ejemplo de Uso

1. En primera instancia el programa da la bienvenida, luego te presenta el menu de opciones que puedes elegir.

```plaintext
    ***************************************************************************
    
    Bienvenido, en esta aplicacion puedes realizar conversion de monedas
    
    ***************************************************************************
    
    Elija la opción para convertir la moneda que requiera:
    1. Dólar a Peso Argentino
    2. Peso Argentino a Dólar
    3. Dólar a Real Brasileño
    4. Real Brasileño a Dólar
    5. Dólar  a peso Colombiano
    6. peso Colombiano a Dólar
    7. Haga la conversion de moneda que requiera
    8. salir
    
```

2. Al sleccionar una opción se presentara el siguiente formato dependiendo el tipo de monedas relacionadas.
   
   Como ejemplo tomaremos la opcion 5 y asignaremos un valor 500 USD:

    ```plaintext
    La tasa de conversion para el día de hoy de: 1 USD = 4410.7298 COP
    Ingrese la cantidad que desea convertir de USD: 500
    ```

3. Al dar enter nos mostrara la conversion que realizara a peso colombiano:

   ```plaintext
   500.0 USD = 2205364.9 COP
   ````

4. La opcion 7 puede elegir del listado la conversion que desees realizar.

-En nuestro caso elegiomos KYD

```plaintext
   En el siguiente listado encontraras las monedas con su respectiva abreviatura para que puedas realizar la conversión de la moneda que requieras:

***************************************************************************


AED	Dírham de los Emiratos Árabes Unidos        AFN	Afgano afgano
ALL	Lek albanés                                 AMD	Dram armenio
ANG	Florín de las Antillas Neerlandesas         AOA	Kwanza angoleño
ARS	Peso argentino                              AUD	Dólar australiano
AWG	Florín de Aruba                             AZN	Manat azerbaiyano
BAM	Bosnia y Herzegovina marca                  BBD	Dólar de Barbados
BDT	Taka de Bangladesh                          BGN	Lev búlgaro
BHD	Dinar bahreiní                              BIF	Franco burundiano
BMD	Dólar de Bermudas                           BND	Dólar de Brunei
BOB	boliviano boliviano                         BRL	Real brasileño
BSD	Dólar de las Bahamas                        BTN	Ngultrum butanés
BWP	Pula de Botsuana                            BYN	Rublo bielorruso
BZD	Dólar beliceño                              CAD	Dólar canadiense
CDF	Franco congoleño                            CHF	Franco suizo
CLP	Peso chileno                                CNY	renminbi chino
COP	Peso colombiano                             CRC	Colón costarricense
CUP	Peso cubano                                 CVE	Escudo de Cabo Verde
CZK	Corona checa                                DJF	Franco de Yibuti
DKK	Corona danesa                               DOP	Peso dominicano
DZD	Dinar argelino                              EGP	Libra egipcia
ERN	Nakfa de Eritrea                            ETB	Birr etíope
EUR	Euro                                        FJD	Dólar de Fiji
FKP	Libra de las Islas Malvinas                 FOK	Corona de las Islas Feroe
GBP	Libra esterlina                             GEL	Lari georgiano
GGP	Libra de Guernsey                           GHS	Cedi de Ghana
GIP	Libra de Gibraltar                          GMD	Dalasi de Gambia
GNF	Franco guineano                             GTQ	Quetzal guatemalteco
GYD	Dólar guyanés                               HKD	Dólar de Hong Kong
HNL	Lempira hondureña                           HRK	Kuna croata
HTG	Gourde haitiano                             HUF	Florín húngaro
IDR	Rupia indonesia                             ILS	Nuevo shekel israelí
IMP	Libra manesa                                INR	Rupia india
IQD	Dinar iraquí                                IRR	Rial iraní
ISK	Corona islandesa                            JEP	Libra de Jersey
JMD	Dólar jamaiquino                            JOD	Dinar jordano
JPY	Yen japonés                                 KES	Chelín keniano
KGS	Som kirguís                                 KHR	Riel camboyano
KID	Dólar de Kiribati                           KMF	Franco comorense
KRW	Won surcoreano                              KWD	Dinar kuwaití
KYD	Dólar de las Islas Caimán                   KZT	Tenge kazajo

Digite la moneda de base: 
KYD
````

-Luego te va a perdir que ingrese la moneda a la que se le realizara la conversion para este ejemplo elegimos GTQ

````platintext
Ingrese la moneda a la que se le va a realizar la conversión: 
GTQ
````
-Despues te mostrada la conversion que se realiza equivalente a 1 KYD y te pide a que valor le vas a hacer la conversion, para el ejemplio elegimo  500 KYD y al dar enter realizara la conversion

````platintext
La tasa de conversion para el día de hoy de: 1 KYD = 9.2563 GTQ
Ingrese la cantidad que desea convertir de KYD: 
500
500.0 KYD = 4628.15 GTQ
````

5. La opción numero 8 del menu finaliza la ejecución de la aplicación.


## Aplicaciones, API Y extension utilizaa
- IntelliJ IDEA
- Java JDK 19
- Gson 2.1.1
- Exchange Rates API
