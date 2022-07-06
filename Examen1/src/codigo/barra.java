package codigo;

public class barra
{
    /*
     * [########                      ]  25%       -->  ? caracteres
     * [##############################]  100%      -->  30 caracteres
     * 25% * 30 caracteres = 100% * ? caracteres
     * (25% * 30 caracteres) / 100%  = ? caracteres
     * ? caracteres = (25% * 30 caracteres) / 100% 
     */
    /**
     * Loading [############################  ] 95%
     * @autor: Andino Padilla Jose
     * @param procentaje : tamano de la letra
     * @param string : caracter a dibujar
     */
    public static void avanceCarga(int procentaje, String string) throws Exception, InterruptedException
    {
        //ANIMACION DE CARGA
        String c= "=-"; 
        for (int x =0 ; x <= 100 ; x++) 
        {
            String srt = "\r "+ c.charAt(x % c.length()) + " " + x + "%";
            System.out.write(srt.getBytes());
            Thread.sleep(50);
        }

        //display
        int TamBar = 30;
        String sb= new String();
        int nroCaracteres = procentaje * TamBar / 100;  //numero de caracteres
        sb =  "\r [";
        for (int k = 0; k <= TamBar; k++)
        {
            sb += "=";
            sb += String.format("%s", ((nroCaracteres < k) ? " " : string));
            
            System.out.write(sb.getBytes());

            for (int x =0 ; x <= 100 ; x++)
            {
                Thread.sleep(1);
            } 

             
            Thread.sleep(20);
        }
        System.out.printf("]");
        System.out.printf(" %d %% ", procentaje);
        System.out.printf("\n");
    }
    
    public static void secuencia()
    {
        String correo="jose.andino@epn.edu.ec";
        String aux="";
        String aux1="";

        for (int i =correo.length()-1; i>=0; i--) 
        {   
            for (int j=correo.length()-1;j>=i;j--) 
            {   
                aux+=correo.charAt(j);     
            }
            StringBuffer sbr = new StringBuffer(aux);
            aux="";
            aux1+=sbr.reverse()+"\n";
        }
        System.out.println(aux1);
    }
}
