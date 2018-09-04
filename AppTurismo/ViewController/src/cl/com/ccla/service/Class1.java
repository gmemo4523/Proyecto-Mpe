package cl.com.ccla.service;

import cl.com.ccla.bean.CCLACuotaTurismo;
import cl.com.ccla.bean.MPECreditoTurismoBean;

import java.io.IOException;

import java.math.BigInteger;

import java.util.List;

public class Class1 {
    public Class1() {
        super();
    }

    public static void main(String[] args) throws IOException {
        MPECreditoTurismoBean  mpe=new MPECreditoTurismoBean();
        List<CCLACuotaTurismo> list=     mpe.turismo(new BigInteger("13281824"));
        System.out.println(list.get(0).getCentro());
        CCLAPagoElectronicoTurismo ccla=new CCLAPagoElectronicoTurismo();
        ccla.initialPago();
        ccla.getListaHistorialTurismo();
     }
}
