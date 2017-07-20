package protocolsupport.protocol.utils.datawatcher.objects;

import io.netty.buffer.ByteBuf;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.serializer.VarNumberSerializer;

public class DataWatcherObjectSVarInt extends DataWatcherObjectNumber<Integer> {

	public DataWatcherObjectSVarInt() {
	}

	public DataWatcherObjectSVarInt(int value) {
		this.value = value;
	}

	@Override
	public void readFromStream(ByteBuf from, ProtocolVersion version) {
		value = VarNumberSerializer.readSVarInt(from);
	}

	@Override
	public void writeToStream(ByteBuf to, ProtocolVersion version) {
		VarNumberSerializer.writeSVarInt(to, value);
	}

}
