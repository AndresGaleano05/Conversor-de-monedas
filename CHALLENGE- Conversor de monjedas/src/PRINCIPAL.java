import java.util.Scanner;

public class PRINCIPAL {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        int opcion = 0;
        System.out.println("***************************************************************************\n" +
                "\nBienvenido, en esta aplicacion puedes realizar conversion de monedas");



        String menu = """
                
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
                """;

        String menuPunto7 = """
                
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
                """;

        while (opcion != 8) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    conversorDeMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    conversorDeMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    conversorDeMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    conversorDeMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    conversorDeMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    conversorDeMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("En el siguiente listado encontraras las monedas con su respectiva abreviatura para que puedas realizar" +
                            " la conversión de la moneda que requieras:");
                    System.out.println(menuPunto7);
                    conversorDeMoneda.convertirMonedaRequerida(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Gracias por utilizar nuestro conversor de moneda, vuelva pronto");
                    break;
                default:
                    System.out.println("La opción digitada no es valida...");
                    break;
            }
        }
    }
}