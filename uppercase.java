public class uppercase {
    public static void main(String[] args) {
        String kelime = "Merhaba";

        // Kelimenin ilk harfini kontrol et
        if (Character.isUpperCase(kelime.charAt(0))) {
            System.out.println("Kelime büyük harfle başlıyor.");
        } else {
            System.out.println("Kelime küçük harfle başlıyor.");
        }

        
        // Kelimenin tüm harflerini kontrol et
        boolean tumHarflerKucuk = true;
        for (char c : kelime.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                tumHarflerKucuk = false;
                break;
            }
        }

        if (tumHarflerKucuk) {
            System.out.println("Kelime tümüyle küçük harflerden oluşuyor.");
        } else {
            System.out.println("Kelime tümüyle küçük harflerden oluşmuyor.");
        }

    }
}
