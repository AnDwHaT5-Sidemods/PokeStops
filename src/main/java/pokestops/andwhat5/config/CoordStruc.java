package pokestops.andwhat5.config;

import com.google.gson.annotations.Expose;

import net.minecraft.util.math.Vec3d;

import java.util.Objects;

public class CoordStruc
{
	public CoordStruc(Vec3d v)
	{
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}

	@Expose
	public double x;
	@Expose
	public double y;
	@Expose
	public double z;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CoordStruc that = (CoordStruc) o;
		return Double.compare(that.x, x) == 0 &&
				Double.compare(that.y, y) == 0 &&
				Double.compare(that.z, z) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}
}
