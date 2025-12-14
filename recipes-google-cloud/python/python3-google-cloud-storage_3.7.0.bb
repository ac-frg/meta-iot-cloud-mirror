DESCRIPTION = "Google Cloud Storage API client library"
HOMEPAGE = "https://github.com/GoogleCloudPlatform/google-cloud-python"
AUTHOR = "Google LLC"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-google-auth \
    python3-google-api-core \
    python3-google-cloud-core \
    python3-google-resumable-media \
    python3-requests \
    python3-google-crc32c \
"

SRC_URI[sha256sum] = "9ce59c65f4d6e372effcecc0456680a8d73cef4f2dc9212a0704799cb3d69237"

PYPI_PACKAGE = "google_cloud_storage"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
