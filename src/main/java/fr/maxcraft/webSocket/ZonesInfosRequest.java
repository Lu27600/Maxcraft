package fr.maxcraft.webSocket;


import fr.maxcraft.server.zone.Zone;
import net.nathem.websocket.NathemWSRequest;
import org.json.simple.JSONObject;

import java.util.ArrayList;


public class ZonesInfosRequest extends NathemWSRequest{




    @Override
    public String getType() {
        return "ZONES-INFOS";
    }

    @Override
    public JSONObject buildData() {
        return new JSONObject();
    }

    @Override
    public void onResponse(JSONObject jsonObject) {



    }
}
