package com.example.app2bim

import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.app2bim.ui.theme.App2BimTheme
import androidx.compose.material3.MaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App2BimTheme {
                Surface(
                    color = Color.White, // Plano de fundo branco
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        val noticias = listOf(
                            Noticia(
                                titulo = "Grêmio atinge a maior sequência de derrotas em 20 anos",
                                descricao = "Tricolor repete marca negativa do ano do segundo rebaixamento à série B.",
                                imagemResId = R.drawable.imagem1
                            ),
                            Noticia(
                                titulo = "Vasco tem seu segundo pior início na história do Brasileirão",
                                descricao = "Entenda as opções de Àlvaro Pacheco que irritaram a diretoria; " +
                                        "Mirando ex-presidentes, Vasco forma comissões de inquérito",
                                imagemResId = R.drawable.imagem2
                            ),
                            Noticia(
                                titulo = "Inter e São Paulo jogam pelo Campeonato Brasileiro",
                                descricao = "Partida acontece nessa quinta em Criciúma.",
                                imagemResId = R.drawable.imagem3
                            ),
                            Noticia(
                                titulo = "CBF marca jogo entre Inter e Juventude para o Beira-Rio",
                                descricao = "Veja datas e horários dos dois jogos pela terceira fase da Copa do Brasil",
                                imagemResId = R.drawable.imagem4
                            ),
                            Noticia(
                                titulo = "Pênalti põe vitória importante na conta do Fortaleza",
                                descricao = "Leão levou a melhor em cima do Grêmio e agora precisa engatar reação na Série A",
                                imagemResId = R.drawable.imagem5
                            ),
                        )

                        noticias.forEach { noticia ->
                            NoticiaItem(noticia)
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }
                }
            }
        }
    }

    data class Noticia(val titulo: String, val descricao: String, val imagemResId: Int)

}

@Composable
fun NoticiaItem(noticia: MainActivity.Noticia) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    {
        Image(
            painter = painterResource(id = noticia.imagemResId),
            contentDescription = null,
            modifier = Modifier.size(120.dp) // Tamanho fixo para todas as imagens
                .border(1.dp, Color.Gray) // Borda cinza de 1dp ao redor da imagem
                .clip(shape = MaterialTheme.shapes.small), // Clip para bordas arredondadas
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = noticia.titulo,
                color = Color.Green // Cor verde
            )
            Text(
                text = noticia.descricao,
                color = Color.Black // Cor preta
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNoticiaItem() {
    App2BimTheme {
        Column {
            val noticias = listOf(
                MainActivity.Noticia(
                    titulo = "Grêmio atinge a maior sequência de derrotas em 20 anos",
                    descricao = "Tricolor repete marca negativa do ano do segundo rebaixamento à série B.",
                    imagemResId = R.drawable.imagem1
                ),
                MainActivity.Noticia(
                    titulo = "Vasco tem seu segundo pior início na história do Brasileirão",
                    descricao = "Entenda as opções de Àlvaro Pacheco que irritaram a diretoria; " +
                            "Mirando ex-presidentes, Vasco forma comissões de inquérito",
                    imagemResId = R.drawable.imagem2
                ),
                MainActivity.Noticia(
                    titulo = "Inter e São Paulo jogam pelo Campeonato Brasileiro",
                    descricao = "Partida acontece nessa quinta em Criciúma.",
                    imagemResId = R.drawable.imagem3
                ),
                MainActivity.Noticia(
                    titulo = "CBF marca jogo entre Inter e Juventude para o Beira-Rio",
                    descricao = "Veja datas e horários dos dois jogos pela terceira fase da Copa do Brasil",
                    imagemResId = R.drawable.imagem4
                ),
                MainActivity.Noticia(
                    titulo = "Pênalti põe vitória importante na conta do Fortaleza",
                    descricao = "Leão levou a melhor em cima do Grêmio e agora precisa engatar reação na Série A",
                    imagemResId = R.drawable.imagem5
                ),
            )

            noticias.forEach { noticia ->
                NoticiaItem(noticia)
                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre os itens, ajustável conforme necessário
            }
        }
    }
}
