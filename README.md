# Nama Proyek

Deskripsi singkat tentang proyek Anda. Misalnya, "Aplikasi manajemen inventaris berbasis Spring Boot."

## Fitur Utama

- **realtime chat**: Realtime chat menggunkan websocket stamp, yang mana aplikasi ini bisa mendapatkan sebuah message secara realtime

## Prerequisites

Sebelum Anda menjalankan aplikasi ini, pastikan Anda telah menginstal:

- [Java JDK 17 atau yang lebih baru](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (jika menggunakan Maven)
- [Gradle](https://gradle.org/install/) (jika menggunakan Gradle)

## Instalasi

### Menggunakan Maven

1. Clone repositori:
    ```bash
    git clone https://github.com/ahyalfan/simple-chat.git
    ```

2. Masuk ke direktori proyek:
    ```bash
    cd simple-chat
    ```

3. Jalankan aplikasi:
    ```bash
    mvn spring-boot:run
    ```

## Konfigurasi

Aplikasi ini menggunakan file konfigurasi `application.properties` yang dapat ditemukan di `src/main/resources`. Berikut adalah beberapa konfigurasi dasar yang dapat Anda ubah:

- **server.port**: Mengatur port server (default: 8080)
- **spring.datasource.url**: URL database (jika menggunakan database)
- **spring.datasource.username**: Nama pengguna database
- **spring.datasource.password**: Kata sandi database

## Penggunaan

Setelah aplikasi berjalan, Anda dapat mengakses antarmuka web di `http://localhost:8080`.

## Uji Coba

Untuk menjalankan pengujian unit dan integrasi, gunakan perintah berikut:

- **Maven**:
    ```bash
    mvn test
    ```
## Dokumentasi API

Jika aplikasi ini menyediakan API, Anda dapat menemukan dokumentasi API di [Swagger UI](http://localhost:8080/swagger-ui.html) atau [Postman](https://www.postman.com/).

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini.
2. Buat cabang baru (`git checkout -b feature-branch`).
3. Lakukan perubahan dan commit (`git commit -am 'Add new feature'`).
4. Push ke cabang Anda (`git push origin feature-branch`).
5. Buat Pull Request.

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](LICENSE).

## Kontak

Jika Anda memiliki pertanyaan atau saran, silakan hubungi:

- **Nama Anda**: [email@example.com](mailto:email@example.com)
- **GitHub**: [https://github.com/username](https://github.com/username)
