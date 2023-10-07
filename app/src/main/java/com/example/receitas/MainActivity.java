package com.example.receitas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Receita> listaReceitas = new ArrayList<>();

        Receita receita1 = new Receita("Risoto de Cogumelos", "Ingredientes:\n" +
                "300g de arroz arbóreo\n" +
                "200g de cogumelos frescos (como shiitake, shimeji)\n" +
                "1 cebola média picada\n" +
                "2 dentes de alho picados\n" +
                "1/2 xícara de vinho branco seco\n" +
                "1,5 litros de caldo de legumes\n" +
                "100g de queijo parmesão ralado\n" +
                "Sal e pimenta a gosto\n" +
                "Azeite de oliva",
                "Instruções:\n"+
                        "1. Em uma panela, aqueça o caldo de legumes e mantenha em fogo baixo.\n" +
                        "2. Em outra panela, refogue a cebola e o alho em azeite até ficarem dourados.\n" +
                        "3. Adicione os cogumelos e cozinhe até que fiquem dourados.\n" +
                        "4. Acrescente o arroz e mexa por alguns minutos.\n" +
                        "5. Adicione o vinho branco e mexa até que seja absorvido.\n" +
                        "6. Gradualmente, adicione conchas do caldo de legumes, mexendo sempre, até que o arroz esteja cozido e o risoto esteja cremoso.\n" +
                        "7. Misture o queijo parmesão e sirva quente.", R.drawable.risoto_cogumelo);

        Receita receita2 = new Receita("Salmão Grelhado com Molho de Mostarda e Mel", "Ingredientes:\n" +
                "4 filés de salmão\n" +
                "2 colheres de sopa de mostarda dijon\n" +
                "2 colheres de sopa de mel\n" +
                "2 colheres de sopa de suco de limão\n" +
                "Sal e pimenta a gosto",
                "Instruções:\n" +
                        "1. Em uma tigela, misture a mostarda, o mel e o suco de limão.\n" +
                        "2. Tempere os filés de salmão com sal e pimenta e pincele com a mistura de mostarda e mel.\n" +
                        "3. Grelhe o salmão por cerca de 4 minutos de cada lado, ou até que esteja cozido ao seu gosto", R.drawable.salmao);

        Receita receita3 = new Receita("Spaghetti alla Carbonara", "Ingredientes:\n" +
                "400g de espaguete\n" +
                "150g de pancetta ou bacon\n" +
                "3 gemas de ovo\n" +
                "1 xícara de queijo pecorino ralado\n" +
                "Pimenta do reino moída na hora",
                "Instruções:\n" +
                        "1. Cozinhe o espaguete em água fervente até ficar al dente. Escorra e reserve um pouco da água do cozimento.\n" +
                        "2. Em uma frigideira, frite a pancetta ou bacon até ficar crocante.\n" +
                        "3. Em uma tigela, bata as gemas e o queijo pecorino.\n" +
                        "4. Misture o espaguete com a pancetta e adicione a mistura de gemas, mexendo bem." +
                        " Se necessário, adicione um pouco da água do cozimento para obter a consistência desejada.", R.drawable.spaghetti);

        Receita receita4 = new Receita("Gazpacho", "Ingredientes:\n" +
                "\n" +
                "1 kg de tomates maduros\n" +
                "1 pepino\n" +
                "1 pimentão vermelho\n" +
                "1 dente de alho\n" +
                "1 cebola pequena\n" +
                "2 colheres de sopa de azeite de oliva\n" +
                "2 colheres de sopa de vinagre de vinho tinto\n" +
                "Sal e pimenta a gosto",
                "Instruções:\n" +
                        "\n" +
                        "1. Corte os tomates, pepino, pimentão, alho e cebola em pedaços pequenos.\n" +
                        "2. Coloque todos os ingredientes em um liquidificador ou processador de alimentos" +
                        " e bata até obter uma mistura homogênea.\n" +
                        "3. Tempere com azeite, vinagre, sal e pimenta a gosto. Leve à geladeira antes de servir.", R.drawable.gazpacho);

        Receita receita5 = new Receita("Tacos de Frango com Guacamoles", "Ingredientes:\n" +
                "\n" +
                "400g de peito de frango\n" +
                "1 pacote de mix de temperos para tacos\n" +
                "8 tortillas de milho ou trigo\n" +
                "2 abacates maduros\n" +
                "1 tomate\n" +
                "1 cebola roxa\n" +
                "Coentro fresco a gosto\n" +
                "Suco de 1 limão\n" +
                "Sal a gosto",
                "Instruções:\n" +
                        "\n" +
                        "1. Tempere o frango com o mix de temperos para tacos e cozinhe em uma frigideira até que esteja completamente cozido.\n" +
                        "2. Em uma tigela, faça o guacamole: amasse os abacates e misture com o tomate, cebola, coentro, suco de limão e sal.\n" +
                        "3. Aqueça as tortillas em uma frigideira ou no micro-ondas.\n" +
                        "4. Monte os tacos com o frango e o guacamole.", R.drawable.tacos);

        Receita receita6 = new Receita("Bolo de Cenoura", "Ingredientes:\n" +
                "\n" +
                "2 cenouras médias\n" +
                "3 ovos\n" +
                "1 xícara de óleo\n" +
                "2 xícaras de açúcar\n" +
                "2 xícaras de farinha de trigo\n" +
                "1 colher de sopa de fermento em pó",
                "Instruções:\n" +
                        "\n" +
                        "1 .Descasque e corte as cenouras em pedaços.\n" +
                        "2. No liquidificador, bata as cenouras, os ovos e o óleo até obter uma mistura homogênea.\n" +
                        "3. Em uma tigela, misture o açúcar, a farinha e o fermento.\n" +
                        "4. Adicione a mistura do liquidificador à tigela e misture bem.\n" +
                        "5. Despeje a massa em uma forma untada e asse em forno preaquecido a 180°C por aproximadamente 40 minutos.", R.drawable.bolo_cenoura);

        Receita receita7 = new Receita("Frango ao Curry", "Ingredientes:\n" +
                "\n" +
                "500g de peito de frango\n" +
                "2 colheres de sopa de curry em pó\n" +
                "1 cebola picada\n" +
                "2 dentes de alho picados\n" +
                "1 lata de leite de coco\n" +
                "Sal e pimenta a gosto",
                "Instruções:\n" +
                        "\n" +
                        "1. Corte o frango em pedaços e tempere com o curry, sal e pimenta.\n" +
                        "2. Em uma panela, aqueça um pouco de óleo e frite o frango até dourar. Reserve.\n" +
                        "3. Na mesma panela, refogue a cebola e o alho até dourarem.\n" +
                        "4. Adicione o frango de volta à panela e acrescente o leite de coco.\n" +
                        "5. Cozinhe em fogo baixo por cerca de 15 minutos, ou até que o frango esteja cozido e o molho tenha engrossado.", R.drawable.frango_cury);

        Receita receita8 = new Receita("Salada de Quinoa com Legumes", "Ingredientes:\n" +
                "\n" +
                "1 xícara de quinoa cozida\n" +
                "1 pepino picado\n" +
                "1 pimentão vermelho picado\n" +
                "1 abacate cortado em cubos\n" +
                "1/2 xícara de tomates cereja\n" +
                "Molho de limão e azeite",
                "Instruções:\n" +
                        "\n" +
                        "1. Misture a quinoa cozida com os legumes em uma tigela grande.\n" +
                        "2. Regue com o molho de limão e azeite e misture bem.\n" +
                        "3. Sirva frio.", R.drawable.salada_quinoa);

        listaReceitas.add(receita1);
        listaReceitas.add(receita2);
        listaReceitas.add(receita3);
        listaReceitas.add(receita4);
        listaReceitas.add(receita5);
        listaReceitas.add(receita6);
        listaReceitas.add(receita7);
        listaReceitas.add(receita8);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, listaReceitas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
