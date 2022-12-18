package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewconcardviewitems.R;

import java.util.ArrayList;

import Modelo.Usuario;

public class AdaptadorUsuario extends ArrayAdapter<Usuario> {

    public AdaptadorUsuario(Context context, ArrayList<Usuario> datos) {
        super(context, R.layout.lyusuarios, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyusuarios, null);

        TextView lblNombre = (TextView) item.findViewById(R.id.lblNombre);
        lblNombre.setText(getItem(position).nombres);

        TextView lblEmail = (TextView) item.findViewById(R.id.lblEmail);
        lblEmail.setText(getItem(position).email);

        TextView lblWeb = (TextView) item.findViewById(R.id.lblweb);
        lblWeb.setText(getItem(position).website);

        ImageView imageView = (ImageView) item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).urlavatar)
                .into(imageView);

        return (item);
    }
}