package com.example.apkfinalai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apkfinalai.R;

public class MainActivity extends AppCompatActivity {

    CheckBox checkPerhatian, checkMencoba, checkResiko, checkTekanan,checkBergaul,checkMenyendiri,checkTdkBeraniAmbilResiko,
            CheckMenarikTekanan,checkBerpikirBerkata, checkSelektifTeman, checkKarismatik,checkSocialTinggi,checkMenyuarakan,checkBersosialisasi,checkKerjaTim;

    Button btnDiagnosa;
    TextView tvResult1;
    TextView tvResult2;
    TextView tvResult3;

    int nilaiINT;
    int nilaiEKS;
    int nilaiAMB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPerhatian = findViewById(R.id.int1);
        checkMencoba = findViewById(R.id.int2);
        checkResiko = findViewById(R.id.int3);
        checkTekanan = findViewById(R.id.int4);
        checkBergaul = findViewById(R.id.int5);
        checkMenyendiri = findViewById(R.id.eks1);
        checkTdkBeraniAmbilResiko = findViewById(R.id.eks2);
        CheckMenarikTekanan = findViewById(R.id.eks3);
        checkBerpikirBerkata = findViewById(R.id.eks4);
        checkSelektifTeman = findViewById(R.id.eks5);
        checkKarismatik= findViewById(R.id.amb1);
        checkSocialTinggi = findViewById(R.id.amb2);
        checkMenyuarakan = findViewById(R.id.amb3);
        checkBersosialisasi = findViewById(R.id.amb4);
        checkKerjaTim = findViewById(R.id.amb5);


        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        tvResult1 = findViewById(R.id.tv_result1);
        tvResult2 = findViewById(R.id.tv_result2);
        tvResult3 = findViewById(R.id.tv_result3);

        tvResult1.setText(""); // Kosongkan TextView saat pertama kali aplikasi
        tvResult2.setText("");
        tvResult3.setText("");


        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                // Untuk Penyakit Gastritis
                if (checkPerhatian.isChecked() ) {
                    nilaiEKS += 20;
                }
                if (checkMencoba.isChecked()) {
                    nilaiEKS += 20;
                }
                if (checkResiko.isChecked()) {
                    nilaiEKS += 20;
                }
                if (checkTekanan.isChecked()) {
                    nilaiEKS += 20;
                }
                if (checkBergaul.isChecked()) {
                    nilaiEKS += 20;
                }
                if (checkMenyendiri.isChecked()) {
                    nilaiINT += 20;
                }
                if (checkTdkBeraniAmbilResiko.isChecked()) {
                    nilaiINT += 20;
                }
                if (CheckMenarikTekanan.isChecked()) {
                    nilaiINT += 20;
                }
                if (checkBerpikirBerkata.isChecked()) {
                    nilaiINT += 20;
                }
                if (checkSelektifTeman.isChecked()) {
                    nilaiINT += 20;
                }
                if (checkKarismatik.isChecked()) {
                    nilaiAMB += 20;
                }
                if (checkSocialTinggi.isChecked()) {
                    nilaiAMB += 20;
                }
                if (checkMenyuarakan.isChecked()) {
                    nilaiAMB += 20;
                }
                if (checkBersosialisasi.isChecked()) {
                    nilaiAMB += 20;
                }
                if (checkKerjaTim.isChecked()) {
                    nilaiAMB += 20;
                }
                // tampilkan penyakit
                tvResult1.setText("Nilai Introvert Anda" + nilaiEKS);
                tvResult2.setText("Nilai Ekstrovert Anda" + nilaiINT);
                tvResult3.setText("Nilai Ambivert Anda" + nilaiAMB);
            }
        });
    }

    public void onClickChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.int1:
                str = checked ? "Suka Menjadi Pusat Perhatian" :
                        "Suka Menjadi Pusat Perhatian Tidak Diseleksi";
                break;
            case R.id.int2:
                str = checked ? "Belajar Dari mencoba Diseleksi" :
                        "Belajar Dari mencoba Tidak Diseleksi";
                break;
            case R.id.int3:
                str = checked ? "Berani mengambil resiko Diseleksi" :
                        "Berani mengambil resiko Tidak Diseleksi";
                break;
            case R.id.int4:
                str = checked ? "Bertindak dalam tekanan Diseleksi" :
                        "Bertindak dalam tekanan Diseleksi";
                break;
            case R.id.int5:
                str = checked ? "Sangat suka bergaul Diseleksi" :
                        "Sangat suka bergaul Tidak Diseleksi";
                break;
            case R.id.eks1:
                str = checked ? "Suka Menyendiri Diseleksi" :
                        "Suka Menyendiri Tidak Diseleksi";
                break;
            case R.id.eks2:
                str = checked ? "Tidak berani ambil resiko Diseleksi" :
                        "Tidak berani ambil resiko Tidak Diseleksi";
                break;
            case R.id.eks4:
                str = checked ? "Menarik diri dari tekanan Diseleksi" :
                        "Menarik diri dari tekanan Tidak Diseleksi";
                break;
            case R.id.eks5:
                str = checked ? "Berpikir sebelum berkata Diseleksi" :
                        "Berpikir sebelum berkata Tidak Diseleksi";
                break;
            case R.id.amb1:
                str = checked ? "Selektif Memilih Diseleksi" :
                        "Selektif Memilih Tidak Diseleksi";
                break;
            case R.id.amb2:
                str = checked ? "Karismatik Diseleksi" :
                        "Karismatik Tidak Diseleksi";
                break;
            case R.id.amb3:
                str = checked ? "Berjiwa Sosial Tinggi Diseleksi" :
                        "Berjiwa Sosial Tinggi Tidak Diseleksi";
                break;
            case R.id.amb4:
                str = checked ? "Tidak Malu Menyuarakan pendapat Diseleksi" :
                        "Tidak Malu Menyuarakan pendapat Tidak Diseleksi";
                break;
            case R.id.amb5:
                str = checked ? "Senang Bersosialisasi Diseleksi" :
                        "Senang Bersosialisasi Tidak Diseleksi";
                break;

        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

}