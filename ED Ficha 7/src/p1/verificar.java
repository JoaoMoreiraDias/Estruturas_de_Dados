package p1;
public class verificar {

    private ADTPilha nova;
    private String palavra;

    private String inicio="<HTML>,<HEAD>,<TITLE>,<BODY>,<B>,<I>,<U>,<TABLE>,<TR>,<TD>,<A HREF=...>,<FONT SIZE=...>";
    private String fim="</HTML>,</HEAD>,</TITLE>,</BODY>,</B>,</I>,</U>,</TABLE>,</TR>,</TD>,</A>,</FONT>";

    public verificar(String texto)
    {
        palavra=texto;
    }

    public void corrigir(String texto)
    {    
        texto=texto+" ";
        int i=texto.indexOf(" ");
        String pal="";
        while(i>0)
        {
            pal=texto.substring(0,i);

            if (inicio.indexOf(pal)>=0)
            {
                nova.Push(pal);
            }
            else

                if (fim.indexOf(pal)>=0)
                {
                    if (nova.getUltimo().substring(1).compareTo(pal.substring(2))==0)
                    {
                        nova.Pop();
                    }
                }

                else
                {
                    System.out.println("A String tem um erro.");
                    break;
                }
            texto=texto.substring(i);
            i=texto.indexOf(" ");
        }

    }

}