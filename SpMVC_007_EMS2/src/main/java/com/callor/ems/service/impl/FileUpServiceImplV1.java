package com.callor.ems.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.ems.service.FileUpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileUpServiceImplV1 implements FileUpService {

	private final ServletContext context;
	private final ResourceLoader resourceLoader;

	public FileUpServiceImplV1(ServletContext context, ResourceLoader resourceLoader) {

		this.context = context;
		this.resourceLoader = resourceLoader;
	}

	@Autowired
	private String upPath;

	@Override
	public String fileUp(MultipartFile file) throws IOException {

		// 파일이 없으면 그냥 끝내기
		if (file == null) {
			return null;
		}

		upPath = resourceLoader.getResource("/file/upload").getURI().getPath();

		log.debug(upPath);

		// 업로드한 파일 이름 추출
		String fileName = file.getOriginalFilename();

		// java.io.File
		File dir = new File(upPath);

		// 만약에 서버에 /uplaod 폴더가 없으면
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File upLoadFile = new File(upPath, fileName);
		file.transferTo(upLoadFile);
		return fileName;
	}

	@Override
	public List<String> filesUp(MultipartHttpServletRequest mFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
