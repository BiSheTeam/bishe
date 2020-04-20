package team.bishe.wms.Exception;

/**
 * WarehouseManageService异常
 *
 */
public class WarehouseManageServiceException extends BusinessException {

    public WarehouseManageServiceException(){
        super();
    }

    public WarehouseManageServiceException(Exception e){
        super(e);
    }

    public WarehouseManageServiceException(Exception e, String exceptionDesc){
        super(e, exceptionDesc);
    }

    public WarehouseManageServiceException(String exceptionDesc){
        super(exceptionDesc);
    }

}
