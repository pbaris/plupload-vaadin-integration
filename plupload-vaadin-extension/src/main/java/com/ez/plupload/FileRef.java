package com.ez.plupload;

import java.io.Serializable;

public class FileRef implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int percent;

    protected String id;

    protected String lastModifiedDate;

    protected long origSize;

    protected long size;

    protected int status;

    protected String type;

    protected long loaded;

    protected String name;
    
    protected String relativePath;

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public long getOrigSize() {
		return origSize;
	}

	public void setOrigSize(long origSize) {
		this.origSize = origSize;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getLoaded() {
		return loaded;
	}

	public void setLoaded(long loaded) {
		this.loaded = loaded;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}
	
	@Override
	public int hashCode() {
		return id == null ? super.hashCode() : id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof FileRef)) {
			return false;
		}
		
		return hashCode() == obj.hashCode();
	}
}
