import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz: ");
        String userName = inp.nextLine();

        if (userName.equals("patika")) {
            System.out.println("sifre giriniz");
            String password = inp.nextLine();

            if (password.equals("java123")) {
                System.out.println("giris yaptınız.");
            } else {
                System.out.println("Yanlıs sifre girdiniz.Sifrenizi sıfırlamak ister misiniz?\nEvet icin 1 giriniz\nHayır icin 2 giriniz");
                int karar = inp.nextInt();

                switch(karar) {
                    case 2:
                        System.out.println("Yanlıs sifre ile giris yapamazsınız.");
                        break;
                    case 1:
                        System.out.println("Yeni sifrenizi giriniz:" + inp.nextLine());
                        String newPwd = inp.nextLine();
                        if (newPwd.equals("java123")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }
                        else if (!newPwd.equals("")) {
                            System.out.println("Şifre oluşturuldu");
                        }
                        else {
                            System.out.println("Şifreyi boş bırakamazsınız!");
                        }
                        break;
                    default:
                        System.out.println("Yanlıs secim yaptınız. Lütfen Evet için 1, hayır için 2 seciniz");
                        break;
                }
            }

        } else {
            System.out.println("Kullanıcı adı yanlıs");
        }
    }
    }



