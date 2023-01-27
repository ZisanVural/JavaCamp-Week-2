package javaCamp_2;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugun hava çok guzel";
		String yeniMesaj = mesaj.substring(0, 2); // substring bir değer döndürmüştür
		System.out.println(yeniMesaj);
	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Guncellendi.");
	}

	public static void topla() {
		return;
	}
}
