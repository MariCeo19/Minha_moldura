package com.example.minhasmolduras

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.minhasmolduras.dados.FonteDeDados
import com.example.minhasmolduras.modulo.IdimagemDescricao
import com.example.minhasmolduras.ui.theme.MinhasMoldurasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhasMoldurasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppGaleriaDeFotos()
                }
            }
        }
    }
}

@Preview
@Composable
fun AppGaleriaDeFotos(){
    LazyColumn( ){
        items(FonteDeDados().carregaListaMolduras()){
            molduraImagemDescricao -> MolduraImagemDescricao(molduraImagemDescricao )
        }
    }
}

@Composable
fun MolduraImagemDescricao(idImagemDescricao:IdimagemDescricao)

{
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
    Column() {
        Image(
            painter = painterResource(id = idImagemDescricao.idImagem),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(410.dp)
                .aspectRatio(10f / 9f)
                .padding(15.dp)

            )

      Text(
          text = stringResource(idImagemDescricao.IdDescricao),
          fontSize = 30.sp,
          fontFamily = FontFamily.Cursive,
          textAlign = TextAlign.Center,
          fontWeight = FontWeight.Black,
          modifier = Modifier
              .fillMaxSize()
      )
    }
   }
 }

@Preview
@Composable
fun PreviewMoldura(){

//    MolduraImagemDescricao(
//        idImagem = R.drawable.imagem3,
//        idDescricao = R.string.descricaoimagem3)


}
