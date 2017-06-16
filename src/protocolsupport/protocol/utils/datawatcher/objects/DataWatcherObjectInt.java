package protocolsupport.protocol.utils.datawatcher.objects;

import io.netty.buffer.ByteBuf;
import protocolsupport.api.ProtocolVersion;

public class DataWatcherObjectInt extends DataWatcherObjectNumber<Integer> {

	public DataWatcherObjectInt() {
	}

	public DataWatcherObjectInt(int i) {
		this.value = i;
	}

	@Override
	public void readFromStream(ByteBuf from, ProtocolVersion version) {
		value = from.readInt();
	}

	@Override
	public void writeToStream(ByteBuf to, ProtocolVersion version) {
		to.writeInt(value);
	}

}
