package zidniryi.com.rvtransportasi;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//Todo 1 Create Kelas atau Extends
// Todo 2 Impelemnt Method dari Kelas RecyclerView
//Todo 3 Create kelas View Holder pada Adapternya
//Todo 4 Make View Holder
// Todo 5 Terakhir create constructor

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    int[] gambar;
    String[] nama, detail;

    public Adapter(Context context, int[] gambar, String[] nama, String[] detail){
        this.context = context;
        this.gambar = gambar;
        this.nama = nama;
        this.detail = detail;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        //Todo 6 Menambahkan COnstructor
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final  int position) {
holder.txtNama.setText(nama[position]);
holder.imgTrans.setImageResource(gambar[position]);

holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //Todo untuk pindah halaman
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("nb", nama[position]);
        intent.putExtra("gb", gambar[position]);
        intent.putExtra("dt", detail[position]);
        context.startActivity(intent);




    }
});
    }

    @Override
    public int getItemCount() {
        return gambar.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTrans;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgTrans = itemView.findViewById(R.id.imglist);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
