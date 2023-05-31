public class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public void inserirInicio(Object info){
        No no = new No();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;

        if(inicio != null){
            inicio.anterior = no;
        }
        inicio = no;
        if(tamanho == 0){
            fim = inicio;
        }
        tamanho++;
    }

    public Object get(int indice){
        No local = inicio;
        for(int i = 0; i < indice; i++){
            local = local.proximo;
        }
        return local.info;
    }

    public Object retirarInicio(){
        if(inicio == null){
            return null;
        }
        Object out = inicio.info;
        inicio = inicio.proximo;
        if(inicio != null){
            inicio.anterior = null;
        } else{
            fim = null;
        }
        tamanho--;
        return out;
    }

    public void inserirFim(Object info){
        No no = new No();
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        fim = no;
        if(fim != null){
            fim.proximo = no;
        }

        if(tamanho == 0){
            inicio = fim;
        }
        tamanho++;
    }

    public Object retirarFim(){
        if(fim == null){
            return null;
        }
        Object out = fim.info;

        fim = fim.anterior;
        if(fim != null){
            fim.proximo = null;
        }else{
            inicio = null;
        }
        tamanho--;
        return out;
    }

    public void inserirMeio(int indice, Object info) {
        if(indice <= 0){
            inserirInicio(info);
        }else if(indice >= tamanho){
            inserirFim(info);
        }else{
            No local = inicio;
            for(int i = 0; i < indice; i++){
                local = local.proximo;
            }
            No no = new No();
            no.info = info;
            no.anterior = local;
            no.proximo = local.proximo;
            local.proximo = no;
            no.proximo.anterior = no;
            tamanho++;
        }
    }

    public Object retirarMeio(int indice){
        if(indice < 0 || indice >= tamanho || inicio == null){
            return null;
        } else if(indice == 0){
            return retirarInicio();
        }else if(indice == tamanho - 1){
            return retirarFim();
        }
        No local = inicio;
        for(int i = 0; i < indice; i++){
            local = local.proximo;
        }
        if(local.anterior != null){
            local.anterior.proximo = local.proximo;
        }
        if(local.proximo != null){
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
        return local.info;
    }
}
