package fr.maxcraft.webSocket;


import net.nathem.websocket.NathemWSRequest;
import org.json.simple.JSONObject;


public class ZonesInfosRequest extends NathemWSRequest{




    @Override
    public String getType() {
        return "ZONES-INFOS";
    }

    @Override
    public JSONObject buildData() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    @Override
    public void onResponse(JSONObject jsonObject) {

    //TODO à compléter?

    }
}
