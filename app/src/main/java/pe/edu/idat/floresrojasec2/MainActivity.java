package pe.edu.idat.floresrojasec2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pe.edu.idat.floresrojasec2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnFormulario.setOnClickListener(this);
        binding.btnListado.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnFormulario){
            startActivity(new Intent(MainActivity.this,
                    FormularioActivity.class));
        }else if(v.getId() == R.id.btnListado){
            startActivity(new Intent(MainActivity.this,
                    ListadoActivity.class));
        }
    }
}


