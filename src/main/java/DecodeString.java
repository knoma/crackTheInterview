/**
 * Created by knoma on 10/20/16.
 */
public class DecodeString {

    public static void main(String[] args) {
        String s = " Ebsýcfs ibcfo xjs wjfm obdihfebdiu voe vot eboo {vsýdlcftpoofo bvg efo fjhfoumjdifo Lfsohfebolfo eft Voufsofinfot; kfefo Nfotdifo voe kfef Pshbojtbujpo ebcfj {v voufstuýu{fo- nfis {v fssfjdifo/ Ebt jtu fjof Njttjpo- lfjo [jfm- ebt nbo ubutådimjdi jshfoexboo fssfjdifo lboo/";
        char[] ch =new char[s.length()];
        char[] chars = s.toCharArray();


        for (int j = 0; j < chars.length; j++) {
         chars[j] = (char) ((int) chars[j] -1);
        }

        System.out.println(new String(chars));

    }
}
