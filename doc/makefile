RM := rm -rf

XELATEX := xelatex
MKLATEX := latexmk

DOC := main.tex
OUTPUT_DIR := .

.PHONY: clean xelatex latexmk

# default action
all: clean xelatex latexmk

# just builds a pdf
xelatex:
	$(XELATEX) -synctex-on -interaction-nonstopmode -halt-on-error -shell-escape -output-directory=$(OUTPUT_DIR) $(DOC)

# runs the build on every file change
latexmk:
	$(MKLATEX) -pvc -f $(DOC)

# remove the intermediate files
clean:
	$(RM) *.aux *.fdb_latexmk *.fls *.log *.synctex.gz *_minted-main

# remove the rendered PDF
dist-clean: clean
	$(RM) *.pdf
