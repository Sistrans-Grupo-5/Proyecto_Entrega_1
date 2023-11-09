package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.TipoPlanConsumoDTO;

public interface TipoPlanConsumoService {

    public void createTipoPlanConsumo(TipoPlanConsumoDTO tipoPlanConsumo);
    
    public TipoPlanConsumoDTO updateTipoPlanConsumo(TipoPlanConsumoDTO tipoPlanConsumo);

    public Long deleteTipoPlanConsumo(Long idTipoPlanConsumo);
    
}
