package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class ImageServiceImpl implements ImageService{

	@Override
	public void addImage(ImageDTO img) {
		
	}

	@Override
	public List<ImageDTO> ImageList(Proxy pxy) {
		return null;
	}

	@Override
	public List<ImageDTO> searchImage(Proxy pxy) {
		return null;
	}

	@Override
	public ImageDTO retrieve(ImageDTO img) {
		return null;
	}

	@Override
	public int countImage(Proxy pxy) {
		return 0;
	}

	@Override
	public void updateImage(ImageDTO img) {
		
	}

	@Override
	public void deleteImage(ImageDTO img) {
		
	}

}
