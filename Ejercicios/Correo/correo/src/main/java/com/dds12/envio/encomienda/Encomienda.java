package com.dds12.envio.encomienda;

import com.dds12.empleado.Empleado;
import com.dds12.entidad.Entidad;
import com.dds12.envio.Envio;
import com.dds12.rastreo.Rastreo;

public class Encomienda extends Envio{
   private EnumEncomienda tipo_encomienda;

   public Encomienda(Entidad remitente, Entidad destinatario, Number precio, Integer codigo_rastreo, Rastreo rastreo_envio, Empleado cartero, EnumEncomienda tipo_encomienda) {
      super(remitente, destinatario, precio, codigo_rastreo, rastreo_envio, cartero);
      this.tipo_encomienda = tipo_encomienda;
   }
}
