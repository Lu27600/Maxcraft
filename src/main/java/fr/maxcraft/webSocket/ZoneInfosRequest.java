package fr.maxcraft.webSocket;


import net.nathem.websocket.NathemWSRequest;
import org.json.simple.JSONObject;


public class ZoneInfosRequest extends NathemWSRequest{

    private int zoneId;

    public ZoneInfosRequest(int zoneId) {
        super();
        this.zoneId = zoneId;
    }

    @Override
    public String getType() {
        return "ZONE-INFOS";
    }

    @Override
    public JSONObject buildData() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Zone-Id", this.zoneId);
        return jsonObject;
    }

    @Override
    public void onResponse(JSONObject jsonObject) {

    //TODO à compléter?

    }
}
