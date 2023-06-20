package com.example.minhasmolduras.dados

import com.example.minhasmolduras.R
import com.example.minhasmolduras.modulo.IdimagemDescricao

class FonteDeDados {

    fun carregaListaMolduras():List<IdimagemDescricao>{
        return listOf<IdimagemDescricao>(
            IdimagemDescricao(R.drawable.imagem1,R.string.descricao_imagem1),
            IdimagemDescricao(R.drawable.imagem2,R.string.descricao_imagem2),
            IdimagemDescricao(R.drawable.imagem3,R.string.descricao_imagem3),
            IdimagemDescricao(R.drawable.imagem4,R.string.descricao_imagem4),
            IdimagemDescricao(R.drawable.imagem5, R.string.descricao_imagem5),
            IdimagemDescricao(R.drawable.imagem6, R.string.descricao_imagem6),
            IdimagemDescricao(R.drawable.imagem7, R.string.descricao_imagem7),
            IdimagemDescricao(R.drawable.imagem8, R.string.descricao_imagem8),
            IdimagemDescricao(R.drawable.imagem9, R.string.descricao_imagem9),
            IdimagemDescricao(R.drawable.imagem10, R.string.descricao_imagem10)
        )
    }
}